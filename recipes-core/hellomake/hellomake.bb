DESCRIPTION = "Hello Program from the make file"
LICENSE = "CLOSED"
SRC_URI = "file://hello.c \
           file://Makefile"
S = "${WORKDIR}"

do_install() {
    oe_runmake install DESTDIR=${D}
}                                                                                             
