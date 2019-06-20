#!/bin/bash

mkdir -p build
cd build
cmake -DCMAKE_TOOLCHAIN_FILE=${ANDROID_NDK_HOME}/build/cmake/android.toolchain.cmake -DANDROID_PLATFORM=16 -DCMAKE_BUILD_TYPE=Debug ..
make VERBOSE=1
status=$?
if [ $status -eq 0 ]; then
  readelf -d ambe
  readelf -A ambe
else
  exit $status
fi

