package com.jeanboy.plugin.timer

class Clock {
    long startTimeInMs

    Clock() {
        this(System.currentTimeMillis())
    }

    Clock(long startTimeInMs) {
        this.startTimeInMs = startTimeInMs
    }

    long getTimeInMs() {
        return System.currentTimeMillis() - startTimeInMs
    }
}
