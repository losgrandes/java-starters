package com.company;

public class Time {
    private Float hour;
    private Float minute;

    public Time(Float hour, Float minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public Float angle() {
        Float minute_angle = this.minute * 6;
        Float hour_angle;
        hour_angle = this.hour * 5 * 6 + minute_angle / 720;
        if(hour_angle > minute_angle) {
            return hour_angle - minute_angle;
        } else {
            return minute_angle - hour_angle;
        }
    }
}