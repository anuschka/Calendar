package model;

import java.util.LinkedList;

public class Meeting extends Event {



    private LinkedList<String> attendees =new LinkedList<String>(); //Creating arraylist

    public Meeting(Date date, Time time, String label, Reminder reminder){
        super(date, time, label, reminder);

    }

    public LinkedList<String> getAttendees() {
        return attendees;
    }

    public void setAttendees(LinkedList<String> attendees) {
        this.attendees = attendees;
    }

    public void addPerson(String person){
        attendees.add(person);
    }

    public void removePerson(String person){
        //Traversing list through for-each loop
        for(String obj:attendees)
            if (obj.equals(person)) {
                attendees.remove(person);
            }
    }

    public void setInvites(){

        //“Inviting: _____”, where _____ is replaced with each email address in turn.
        StringBuilder s = new StringBuilder();

        for(String obj:attendees)
            s.append(obj + ", ");

        System.out.println("Inviting to this meeting: " + s);
    }
}


