package com.softserve.set.practicalTasks.n3_ConditionalStatements.task2;

public enum DayOfWeek {

    SUNDAY("SUNDAY", "НЕДІЛЯ"), MONDAY("MONDAY", "ПОНЕДІЛОК"), TUESDAY("TUESDAY", "СЕРЕДА"),
    WEDNESDAY("WEDNESDAY", "ВІВТОРОК"), THURSDAY("THURSDAY", "ЧЕТВЕР"), FRIDAY("FRIDAY", "П'ЯТНИЦЯ"),
    SATURDAY("SATURDAY", "СУБОТА");

    private final String ua;
    private final String en;

    public String getUa() {
        return ua;
    }

    public String getEn() {
        return en;
    }

    private DayOfWeek(String en, String ua) {
        this.en = en;
        this.ua = ua;
    }
}
