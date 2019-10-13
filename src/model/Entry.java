package model;

import model.Date;
import model.Time;

public abstract class Entry {
    //// TODO 4: Design the specification for your abstract Entry class.
    // Make sure that the Entry constructor takes a Date, Time and label as arguments to the constructor;
    // after all, we’ll have to put an entry somewhere on the calendar! Of course, we’ll require the Date
    // and Time for the entry to be sometime in the future.
    //
    //Entry also needs the following functionality:
    //
    //Getters for Date, Time and label
    //Getter and setter for interval of repetition
    //Getter for whether the entry is repeating
    //Our Entry will be fairly simple; let’s say that if any of the important details (i.e. date, time)
    // need to be reset, the user will have to delete this Entry and add a new one.
    //
    //Since Entry is abstract, we’ll need some non-abstract subclasses before we can make a test object.
    // So don’t worry about the use and test steps of data abstraction until we have Event, Meeting and Reminder.


    private Date date;
    private Time time;
    private String label;

    private boolean isRepeating;
    private int intervalOfRepetition; // interval of repetition in days


    // constructor for Event
    protected Entry(Date date, Time time, String label) {
        this.date = date;
        this.time = time;
        this.label = label;
        isRepeating = false;
        intervalOfRepetition = 0;
    }

    //getters and setters
    public Date getDate() {
        return date;
    }

    public Time getTime() {
        return time;
    }

    public String getLabel() {
        return label;
    }

    public boolean isRepeating() {
        return isRepeating;
    }

    public void setRepeating(boolean repeating) {
        isRepeating = repeating;
    }

    public int getIntervalOfRepetition() {
        return intervalOfRepetition;
    }

    public void setIntervalOfRepetition(int intervalOfRepetition) {
        this.intervalOfRepetition = intervalOfRepetition;
    }
}


