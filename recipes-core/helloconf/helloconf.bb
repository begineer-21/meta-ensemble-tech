DESCRIPTION = "Hello program using autotools"
LICENSE = "CLOSED"

SRC_URI = "file://hello.c \
           file://configure.ac \
           file://Makefile.am"

S = "${WORKDIR}"

inherit autotools
