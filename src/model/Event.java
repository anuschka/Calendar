package model;

public class Event extends Entry {

    Reminder reminder;

    public Event(Date date, Time time, String label, Reminder reminder){
        super(date, time, label);
        this.reminder=reminder;
    }

    //getter and setter for Reminder.
    public Reminder getReminder() {
        return reminder;
    }

    public void setReminder(Reminder reminder) {
        this.reminder = reminder;
    }

}
