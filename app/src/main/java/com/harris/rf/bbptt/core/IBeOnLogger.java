package com.harris.rf.bbptt.core;
/* loaded from: classes.dex */
public interface IBeOnLogger {
    int getLogLevel();

    void log(int i, String str, int i2, String str2);

    void setLogLevel(int i);

    /* loaded from: classes.dex */
    public enum LogLevel {
        LOG_LEVEL_TRACE(0, "TRC"),
        LOG_LEVEL_DEBUG(1, "DBG"),
        LOG_LEVEL_INFO(2, "INF"),
        LOG_LEVEL_WARN(3, "WRN"),
        LOG_LEVEL_ERROR(4, "ERR"),
        LOG_LEVEL_NONE(5, "---");
        
        private final String tag;
        private final int value;

        LogLevel(int i, String str) {
            this.value = i;
            this.tag = str;
        }

        public int getValue() {
            return this.value;
        }

        public String getTag() {
            return this.tag;
        }
    }
}
