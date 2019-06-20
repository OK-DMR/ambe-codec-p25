#!/bin/bash

adb push build/ambe /data/local/tmp/
adb push lib/*.so /data/local/tmp/
adb shell LD_LIBRARY_PATH=/data/local/tmp/ /data/local/tmp/ambe
