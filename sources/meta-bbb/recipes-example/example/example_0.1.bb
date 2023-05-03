SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d41d8cd98f00b204e9800998ecf8427e"

SRC_URI += " file://example.cpp "

S = "${WORKDIR}"

TARGET_CC_ARCH += "${LDFLAGS}"

do_compile() {
    ${CXX} -Wall -g example.cpp -o example
}

do_install() {
    # Install example binary
    install -d ${D}${bindir}
    install -m 0755 ${S}/example ${D}${bindir}

    # Install test file
    install -d ${D}/etc
    touch ${D}/etc/test.txt
}


FILES_${PN} += "/etc/test.txt"
