# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "git://github.com/htop-dev/htop.git;protocol=https;branch=main"

# Modify these as desired
PV = "3.3.0-dev+git${SRCPV}"
SRCREV = "f50944c3d563238c9843057978041f2cd7c3b285"

S = "${WORKDIR}/git"

# NOTE: unable to map the following pkg-config dependencies: hwloc
#       (this is based on recipes that have previously been built and packaged)
# NOTE: the following library dependencies are unknown, ignoring: hwloc sensors unwind
#       (this is based on recipes that have previously been built and packaged)
DEPENDS = "systemd libcap libnl xz"

# NOTE: if this software is not capable of being built in a separate build directory
# from the source, you should replace autotools with autotools-brokensep in the
# inherit line
inherit pkgconfig autotools

# Specify any options you want to pass to the configure script using EXTRA_OECONF:
EXTRA_OECONF = ""

#FILES_${PN} += "${usrdir}/*"
FILES:${PN} += "/usr/share/icons"
FILES_${PN} += "/usr/share/icons/hicolor"
FILES_${PN} += "/usr/share/icons/hicolor/scalable"
FILES_${PN} += "/usr/share/icons/hicolor/scalable/apps"
FILES_${PN} += "/usr/share/icons/hicolor/scalable/apps/htop.svg"

