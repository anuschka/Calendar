package model;

public class Reminder extends Entry {


    private String note;

    //Create a default constructor for Reminder.
    public Reminder(Date date, Time time, String label, String note) {
        super(date, time, label);
        this.note=note;
    }

    //Create getter and setter for an additional note.
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}
