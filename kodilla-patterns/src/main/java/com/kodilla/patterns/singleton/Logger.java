package com.kodilla.patterns.singleton;

public enum Logger {

    INSTANCE;

    private String lastLog = "";

    public String getLastLog() {
        return lastLog;
    }

    public void log(final String log) {
        this.lastLog = log;
        System.out.println("Log: [" + log + "]");
    }
}