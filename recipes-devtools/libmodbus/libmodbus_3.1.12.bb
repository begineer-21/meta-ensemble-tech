DESCRIPTION="recipe for libmodbus using https"
LICENSE="GPLv2.1"
LIC_FILES_CHKSUM="file://COPYING.LESSER;md5=4fbd65380cdd255951079008b364516c"
SRC_URI="https://github.com/stephane/libmodbus/releases/download/v3.1.12/libmodbus-3.1.12.tar.gz"
SRC_URI[md5sum]="a9698fb1197be620e5b2eb77d806699b"
SRC_URI[sha256sum]="2f4d4191cd196c1fba131daec03b621db75129d8255c832fc66b259d9fc46e7b"

S="${WORKDIR}/libmodbus-3.1.12"

inherit autotools pkgconfig
