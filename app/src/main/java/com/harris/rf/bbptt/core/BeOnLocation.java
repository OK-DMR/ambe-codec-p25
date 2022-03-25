package com.harris.rf.bbptt.core;

import java.io.Serializable;
/* loaded from: classes.dex */
public class BeOnLocation implements Serializable {
    public static final int GPS_SOURCE_BASE_STATION = 3;
    public static final int GPS_SOURCE_EXTERNAL_GPS_RECEIVER = 4;
    public static final int GPS_SOURCE_INTERNAL_GPS_RECEIVER = 1;
    public static final int GPS_SOURCE_UNAVAILABLE = 0;
    public static final int GPS_SOURCE_VTAC = 2;
    public static final int GPS_STATUS_CHOSEN_SATELLITE_UNUSABLE = 12;
    public static final int GPS_STATUS_DOING_POSITION_FIXES = 0;
    public static final int GPS_STATUS_FIX_UNKNOWN_SATELLITES = 13;
    public static final int GPS_STATUS_GPS_TIME_NOT_ACQUIRED = 1;
    public static final int GPS_STATUS_INVALID = -1;
    public static final int GPS_STATUS_NEED_INITIALIZATION = 2;
    public static final int GPS_STATUS_NO_GPS_CAPABILITY = 255;
    public static final int GPS_STATUS_NO_USEABLE_SATELLITES = 8;
    public static final int GPS_STATUS_ONE_SATELLITE = 9;
    public static final int GPS_STATUS_PDOP_TOO_HIGH = 3;
    public static final int GPS_STATUS_THREE_SATELLITE = 11;
    public static final int GPS_STATUS_TWO_SATELLITE = 10;
    public static final int GPS_STATUS_UNKNOWN = 254;
    private double accuracy;
    private double altitude;
    private int gpsSource;
    private int gpsStatus;
    private double latitude;
    private double longitude;
    private long timeOfFix;
    private long timeReceived;

    public BeOnLocation() {
        this.gpsStatus = -1;
        this.gpsSource = 0;
    }

    public BeOnLocation(double d, double d2, double d3, double d4, long j, long j2, int i, int i2) {
        this.latitude = d;
        this.longitude = d2;
        this.altitude = d3;
        this.accuracy = d4;
        this.timeOfFix = j;
        this.timeReceived = j2;
        this.gpsStatus = i;
        this.gpsSource = i2;
    }

    public BeOnLocation(BeOnLocation beOnLocation) {
        this.latitude = beOnLocation.latitude;
        this.longitude = beOnLocation.longitude;
        this.altitude = beOnLocation.altitude;
        this.accuracy = beOnLocation.accuracy;
        this.timeOfFix = beOnLocation.timeOfFix;
        this.timeReceived = beOnLocation.timeReceived;
        this.gpsStatus = beOnLocation.gpsStatus;
        this.gpsSource = beOnLocation.gpsSource;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public BeOnLocation setLatitude(double d) {
        this.latitude = d;
        return this;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public BeOnLocation setLongitude(double d) {
        this.longitude = d;
        return this;
    }

    public double getAltitude() {
        return this.altitude;
    }

    public BeOnLocation setAltitude(double d) {
        this.altitude = d;
        return this;
    }

    public double getAccuracy() {
        return this.accuracy;
    }

    public BeOnLocation setAccuracy(double d) {
        this.accuracy = d;
        return this;
    }

    public long getTimeOfFix() {
        return this.timeOfFix;
    }

    public BeOnLocation setTimeOfFix(long j) {
        this.timeOfFix = j;
        return this;
    }

    public long getTimeReceived() {
        return this.timeReceived;
    }

    public BeOnLocation setTimeReceived(long j) {
        this.timeReceived = j;
        return this;
    }

    public int getGpsStatus() {
        return this.gpsStatus;
    }

    public BeOnLocation setGpsStatus(int i) {
        this.gpsStatus = i;
        return this;
    }

    public int getGpsSource() {
        return this.gpsSource;
    }

    public BeOnLocation setGpsSource(int i) {
        this.gpsSource = i;
        return this;
    }

    public boolean hasMoved(BeOnLocation beOnLocation) {
        return (beOnLocation != null && beOnLocation.latitude == this.latitude && beOnLocation.longitude == this.longitude && beOnLocation.altitude == this.altitude) ? false : true;
    }

    boolean hasBeenSet() {
        return this.gpsStatus != -1;
    }

    public boolean isValid() {
        int i = this.gpsStatus;
        return i == 9 || i == 10 || i == 11 || i == 13;
    }
}
