DESCRIPTION="recipe for mbpoll"
LICENSE="GPL3.0v"
LIC_FILES_CHKSUM="file://COPYING;md5=1ebbd3e34237af26da5dc08a4e440464"
SRC_URI="https://github.com/epsilonrt/mbpoll/archive/refs/tags/v1.4.11.tar.gz"
SRC_URI[md5sum]="b08cbc52a3e8bed79b3c3c75a5048881"
SRC_URI[sha256sum]="5d332e8f413163adfc80abc2407439210fff2eb06559344a3e491d3f6531b001"
S="${WORKDIR}/mbpoll-${PV}"

DEPENDS+="libmodbus"

inherit cmake pkgconfig

