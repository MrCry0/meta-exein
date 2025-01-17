inherit cargo_bin pkgconfig

SUMMARY = "pulsar"
HOMEPAGE = "https://pulsar.sh"
LICENSE = "Apache-2.0"
SRC_URI += "git://git@github.com/Exein-io/pulsar.git;protocol=ssh;nobranch=1;branch=main"
LIC_FILES_CHKSUM = "file://LICENSES/LICENSE-APACHE-2.0;md5=a0b5614acd31d1f66c2b9fe2c035f5dd"
SRCREV = "6c8b285a4228ac80eb655b927db754b430cd222e"

S = "${WORKDIR}/git"
CARGO_SRC_DIR = "pulsar"

PV:append = ".AUTOINC+6c8b285a42"

# Already stripped when built in release
INSANE_SKIP:${PN} += "already-stripped"

# Needed because meta-rust-bin needs the network at compile stage
do_compile[network] = "1"

do_install () {
    # Select output directory 
    if [ "${CARGO_BUILD_TYPE}" = "--release" ]; then
        local cargo_bindir="${CARGO_RELEASE_DIR}"
    else
        local cargo_bindir="${CARGO_DEBUG_DIR}"
    fi

    # Create directory structure
    install -d ${D}${bindir}
    install -d ${D}/var/lib/pulsar
    install -d ${D}/var/lib/pulsar/rules

    # Init empty configuration
    install -m 644 /dev/null ${D}/var/lib/pulsar/pulsar.ini

    # Install rules
    install -m 644 ${S}/rules/basic-rules.yaml ${D}/var/lib/pulsar/rules/basic-rules.yaml

    # Install pulsar helper scripts
    install -m 755 ${S}/scripts/pulsar ${D}${bindir}/pulsar
    install -m 755 ${S}/scripts/pulsard ${D}${bindir}/pulsard

    # Install pulsar base executable
    install -m 755 ${cargo_bindir}/pulsar-exec ${D}${bindir}
}
