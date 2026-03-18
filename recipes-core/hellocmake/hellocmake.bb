DESCRIPTION = "HELLO FROM CMAKE"
LICENSE = "CLOSED"
SRC_URI = "file://hello.c\
	   file://CMakeLists.txt"
S = "${WORKDIR}"

inherit cmake
