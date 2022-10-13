inherit cargo pkgconfig

SRC_URI += "git://git@github.com/Exein-io/cosmo-cli.git;protocol=ssh;nobranch=1;branch=main"
SRCREV = "0e401abb0e17bcc1b026fde19714b38b3869c796"
S = "${WORKDIR}/git"
CARGO_SRC_DIR = ""
PV:append = ".AUTOINC+0e401abb0e"

SRC_URI += " \
    crate://crates.io/addr2line/0.17.0 \
    crate://crates.io/adler/1.0.2 \
    crate://crates.io/aho-corasick/0.7.18 \
    crate://crates.io/android_system_properties/0.1.5 \
    crate://crates.io/anyhow/1.0.65 \
    crate://crates.io/async-trait/0.1.57 \
    crate://crates.io/atty/0.2.14 \
    crate://crates.io/autocfg/1.1.0 \
    crate://crates.io/backtrace/0.3.65 \
    crate://crates.io/base64/0.13.0 \
    crate://crates.io/bitflags/1.3.2 \
    crate://crates.io/bumpalo/3.9.1 \
    crate://crates.io/bytes/1.1.0 \
    crate://crates.io/cc/1.0.73 \
    crate://crates.io/cfg-if/1.0.0 \
    crate://crates.io/chrono/0.4.22 \
    crate://crates.io/clap-verbosity-flag/1.0.0 \
    crate://crates.io/clap/3.1.12 \
    crate://crates.io/clap_derive/3.1.7 \
    crate://crates.io/clap_lex/0.1.1 \
    crate://crates.io/codespan-reporting/0.11.1 \
    crate://crates.io/core-foundation-sys/0.8.3 \
    crate://crates.io/core-foundation/0.9.3 \
    crate://crates.io/cxx-build/1.0.78 \
    crate://crates.io/cxx/1.0.78 \
    crate://crates.io/cxxbridge-flags/1.0.78 \
    crate://crates.io/cxxbridge-macro/1.0.78 \
    crate://crates.io/dirs-sys/0.3.7 \
    crate://crates.io/dirs/4.0.0 \
    crate://crates.io/encoding_rs/0.8.31 \
    crate://crates.io/env_logger/0.9.1 \
    crate://crates.io/fastrand/1.7.0 \
    crate://crates.io/fnv/1.0.7 \
    crate://crates.io/foreign-types-shared/0.1.1 \
    crate://crates.io/foreign-types/0.3.2 \
    crate://crates.io/form_urlencoded/1.0.1 \
    crate://crates.io/futures-channel/0.3.21 \
    crate://crates.io/futures-core/0.3.21 \
    crate://crates.io/futures-sink/0.3.21 \
    crate://crates.io/futures-task/0.3.21 \
    crate://crates.io/futures-util/0.3.21 \
    crate://crates.io/getrandom/0.2.6 \
    crate://crates.io/gimli/0.26.1 \
    crate://crates.io/h2/0.3.13 \
    crate://crates.io/hashbrown/0.11.2 \
    crate://crates.io/heck/0.4.0 \
    crate://crates.io/hermit-abi/0.1.19 \
    crate://crates.io/http-body/0.4.4 \
    crate://crates.io/http/0.2.6 \
    crate://crates.io/httparse/1.7.0 \
    crate://crates.io/httpdate/1.0.2 \
    crate://crates.io/human-panic/1.0.3 \
    crate://crates.io/humantime/2.1.0 \
    crate://crates.io/hyper-tls/0.5.0 \
    crate://crates.io/hyper/0.14.18 \
    crate://crates.io/iana-time-zone-haiku/0.1.0 \
    crate://crates.io/iana-time-zone/0.1.51 \
    crate://crates.io/idna/0.2.3 \
    crate://crates.io/indexmap/1.8.1 \
    crate://crates.io/instant/0.1.12 \
    crate://crates.io/ipnet/2.5.0 \
    crate://crates.io/itoa/1.0.1 \
    crate://crates.io/js-sys/0.3.57 \
    crate://crates.io/jsonwebtoken/8.1.1 \
    crate://crates.io/lazy_static/1.4.0 \
    crate://crates.io/libc/0.2.135 \
    crate://crates.io/link-cplusplus/1.0.7 \
    crate://crates.io/log/0.4.17 \
    crate://crates.io/matches/0.1.9 \
    crate://crates.io/memchr/2.4.1 \
    crate://crates.io/mime/0.3.16 \
    crate://crates.io/mime_guess/2.0.4 \
    crate://crates.io/miniz_oxide/0.5.1 \
    crate://crates.io/mio/0.8.4 \
    crate://crates.io/native-tls/0.2.10 \
    crate://crates.io/num-bigint/0.4.3 \
    crate://crates.io/num-integer/0.1.44 \
    crate://crates.io/num-traits/0.2.14 \
    crate://crates.io/num_cpus/1.13.1 \
    crate://crates.io/num_threads/0.1.5 \
    crate://crates.io/object/0.28.3 \
    crate://crates.io/once_cell/1.10.0 \
    crate://crates.io/openssl-macros/0.1.0 \
    crate://crates.io/openssl-probe/0.1.5 \
    crate://crates.io/openssl-src/111.22.0+1.1.1q \
    crate://crates.io/openssl-sys/0.9.76 \
    crate://crates.io/openssl/0.10.42 \
    crate://crates.io/os_str_bytes/6.0.0 \
    crate://crates.io/os_type/2.4.0 \
    crate://crates.io/pem/1.0.2 \
    crate://crates.io/percent-encoding/2.1.0 \
    crate://crates.io/pin-project-lite/0.2.9 \
    crate://crates.io/pin-utils/0.1.0 \
    crate://crates.io/pkg-config/0.3.25 \
    crate://crates.io/proc-macro-error-attr/1.0.4 \
    crate://crates.io/proc-macro-error/1.0.4 \
    crate://crates.io/proc-macro2/1.0.46 \
    crate://crates.io/quickcheck/1.0.3 \
    crate://crates.io/quote/1.0.18 \
    crate://crates.io/rand/0.8.5 \
    crate://crates.io/rand_core/0.6.3 \
    crate://crates.io/redox_syscall/0.2.13 \
    crate://crates.io/redox_users/0.4.3 \
    crate://crates.io/regex-syntax/0.6.25 \
    crate://crates.io/regex/1.5.5 \
    crate://crates.io/remove_dir_all/0.5.3 \
    crate://crates.io/reqwest/0.11.12 \
    crate://crates.io/ring/0.16.20 \
    crate://crates.io/rpassword/6.0.1 \
    crate://crates.io/rustc-demangle/0.1.21 \
    crate://crates.io/ryu/1.0.9 \
    crate://crates.io/schannel/0.1.19 \
    crate://crates.io/scratch/1.0.2 \
    crate://crates.io/security-framework-sys/2.6.1 \
    crate://crates.io/security-framework/2.6.1 \
    crate://crates.io/semver/1.0.14 \
    crate://crates.io/serde/1.0.145 \
    crate://crates.io/serde_derive/1.0.145 \
    crate://crates.io/serde_json/1.0.86 \
    crate://crates.io/serde_urlencoded/0.7.1 \
    crate://crates.io/simple_asn1/0.6.1 \
    crate://crates.io/slab/0.4.6 \
    crate://crates.io/socket2/0.4.4 \
    crate://crates.io/spin/0.5.2 \
    crate://crates.io/strsim/0.10.0 \
    crate://crates.io/syn/1.0.102 \
    crate://crates.io/tempfile/3.3.0 \
    crate://crates.io/term-table/1.3.2 \
    crate://crates.io/termcolor/1.1.3 \
    crate://crates.io/textwrap/0.15.0 \
    crate://crates.io/thiserror-impl/1.0.30 \
    crate://crates.io/thiserror/1.0.30 \
    crate://crates.io/time-macros/0.2.4 \
    crate://crates.io/time/0.1.44 \
    crate://crates.io/time/0.3.9 \
    crate://crates.io/tinyvec/1.6.0 \
    crate://crates.io/tinyvec_macros/0.1.0 \
    crate://crates.io/tokio-macros/1.7.0 \
    crate://crates.io/tokio-native-tls/0.3.0 \
    crate://crates.io/tokio-util/0.7.1 \
    crate://crates.io/tokio/1.21.2 \
    crate://crates.io/toml/0.5.9 \
    crate://crates.io/tower-service/0.3.1 \
    crate://crates.io/tracing-attributes/0.1.20 \
    crate://crates.io/tracing-core/0.1.26 \
    crate://crates.io/tracing/0.1.34 \
    crate://crates.io/try-lock/0.2.3 \
    crate://crates.io/unicase/2.6.0 \
    crate://crates.io/unicode-bidi/0.3.8 \
    crate://crates.io/unicode-ident/1.0.5 \
    crate://crates.io/unicode-normalization/0.1.19 \
    crate://crates.io/unicode-width/0.1.9 \
    crate://crates.io/untrusted/0.7.1 \
    crate://crates.io/url/2.2.2 \
    crate://crates.io/uuid/0.8.2 \
    crate://crates.io/uuid/1.2.1 \
    crate://crates.io/vcpkg/0.2.15 \
    crate://crates.io/version_check/0.9.4 \
    crate://crates.io/want/0.3.0 \
    crate://crates.io/wasi/0.10.0+wasi-snapshot-preview1 \
    crate://crates.io/wasi/0.11.0+wasi-snapshot-preview1 \
    crate://crates.io/wasm-bindgen-backend/0.2.80 \
    crate://crates.io/wasm-bindgen-futures/0.4.30 \
    crate://crates.io/wasm-bindgen-macro-support/0.2.80 \
    crate://crates.io/wasm-bindgen-macro/0.2.80 \
    crate://crates.io/wasm-bindgen-shared/0.2.80 \
    crate://crates.io/wasm-bindgen/0.2.80 \
    crate://crates.io/web-sys/0.3.57 \
    crate://crates.io/winapi-i686-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi-util/0.1.5 \
    crate://crates.io/winapi-x86_64-pc-windows-gnu/0.4.0 \
    crate://crates.io/winapi/0.3.9 \
    crate://crates.io/windows-sys/0.36.1 \
    crate://crates.io/windows_aarch64_msvc/0.36.1 \
    crate://crates.io/windows_i686_gnu/0.36.1 \
    crate://crates.io/windows_i686_msvc/0.36.1 \
    crate://crates.io/windows_x86_64_gnu/0.36.1 \
    crate://crates.io/windows_x86_64_msvc/0.36.1 \
    crate://crates.io/winreg/0.10.1 \
"

LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SUMMARY = "Easy Cosmo pipeline helper"
HOMEPAGE = "https://cosmo.exein.io"
LICENSE = "Apache-2.0"

DEPENDS = "openssl-native"


do_install() {
    cp ${B}/target/${CARGO_TARGET_SUBDIR}/cosmo ${TOPDIR}/../scripts/cosmo
}


BBCLASSEXTEND = "native"
