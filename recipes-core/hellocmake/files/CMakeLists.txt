cmake_minimum_required(VERSION 3.5)

project(hellocmake)

add_executable(hellocmake hello.c)

install(TARGETS hellocmake DESTINATION bin)

