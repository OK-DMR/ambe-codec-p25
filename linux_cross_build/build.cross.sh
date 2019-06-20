#!/bin/bash

mkdir -p build
cd build
cmake -DCMAKE_TOOLCHAIN_FILE=../gcc-arm-linux-gnueabi.toolchain -DCMAKE_BUILD_TYPE=Debug -P ../CMakeLists.cross.txt ..
make VERBOSE=1
status=$?
if [ $status -eq 0 ]; then
  readelf -d ambe
  readelf -A ambe
else
  exit $status
fi

