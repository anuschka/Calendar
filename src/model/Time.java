package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Time {
    // TODO 3: Design a Time class that takes hours and minutes in the constructor.
    // You can either return this information with the time in 12 hours and an indicator for AM or PM, or
    // return the time in 24 hours. You can also do both! These two classes are flexible, because
    // we’re only using their basic functionality for Calendar.



    /**
     * private attribute for holding minutes
     */
    private int minute;

    /**
     * private attribute for holding hour
     */
    private int hour;


    /**
     * create getters for minutes and hour
     */
    public int getMinute() {
        return minute;
    }

    public int getHour() {
        return hour;
    }

    // Default Constructor
    public Time() {
        Calendar currentDate = Calendar.getInstance(); //Get the current date
        java.util.Date x = currentDate.getTime();
        SimpleDateFormat formathour= new SimpleDateFormat("HH");
        this.hour = Integer.parseInt(formathour.format(x));
        SimpleDateFormat formatminute = new SimpleDateFormat("mm");
        this.minute = Integer.parseInt(formatminute.format(x));
       
    }

    /**
     * Constructor that takes hour/minute
     * @param hour
     * @param minute
     * @throws IllegalArgumentException if invalid
     */
    public Time(int hour, int minute) throws IllegalArgumentException{
        if (!isValid(hour, minute)) throw new IllegalArgumentException();
        this.hour = hour;
        this.minute = minute;
    }

    /**
     * Check if given hour/minute is valid
     * @param hour
     * @param minute
     * @return true if it is valid time
     */
    public static boolean isValid(int hour, int minute) {
        Boolean valid = true;
        if ((hour < 0) || (hour > 24)) {valid=false;};
        if ((minute < 0) || (minute > 60)) {valid=false;};
        if ((hour==24) && ( minute > 0)) {valid=false;};
        return valid;
    }

    /**
     * return a string representation
     * convert to ISO 8601 Date Format
     * http://en.wikipedia.org/wiki/ISO_8601
     *
     * @return
     */
    public String toAmPm() {
        StringBuilder s = new StringBuilder();

        if (this.hour < 12){
            s.append(this.hour);
            s.append(":");
            s.append(this.minute);
            s.append(" AM");
        }else{
            s.append(this.hour-12);
            s.append(":");
            s.append(this.minute);
            s.append(" PM");
        }
        return String.valueOf(s);
    }

}
