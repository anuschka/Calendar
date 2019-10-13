package model;
import model.Date;

import java.util.LinkedList;

public class Calendar {
    //TODO 6: Calendar
    //Our calendar is fairly simple: it has one constructor that takes a Date, which it sets as the current Date;
    // it has one email that it’s associated with; it has getters for those fields; and it can add or remove Entries.
    // You will definitely want at least one getter that returns every item in the collection. You may also want to
    // add getters that return the soonest Entry, that return Entries by name, or that return only Meetings… this is
    // up to you, and it depends on how you want to use your Calendar. You can always start with a simple
    // specification and then expand your functionality once you get the type hierarchy working.

    Date date;


    String emailAddress;
    LinkedList<Entry> entryList = new LinkedList<Entry>();

    public Calendar() {
        date = new Date();
        emailAddress = "my@gmail.com";

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void addEntry(Entry entry) {
        entryList.add(entry);

    }

    public void removeEntry(Entry entry) {
        //Traversing list through for-each loop
        for (Entry obj : entryList)
            if (obj.equals(entry)) {
                entryList.remove(entry);
            }
    }

    public void listAllEntries() {
        //Traversing list through for-each loop
        System.out.println("All events are:");
        for (Entry obj : entryList) {
            System.out.println(obj.getLabel() + " on " + obj.getDate().toLong() +
                    " at " + obj.getTime().toAmPm());

        }
    }

    public void listAllMeetings() {
        //Traversing list through for-each loop
        System.out.println("All meetings are:");
        for (Entry obj : entryList) {
            if (obj instanceof Meeting) {
                System.out.println(obj.getLabel() + " on " + obj.getDate().toLong() +
                        " at " + obj.getTime().toAmPm());

            }
        }
    }

    public Date returnSoonestEntry() {
        //Traversing list through for-each loop
        Date soonerEntry;
       if (entryList.size()==0)
            {return null;}
       else if(entryList.size()==1)
            {return entryList.getFirst().getDate();}
       else {
           soonerEntry = entryList.getFirst().getDate();
           for(Entry obj: entryList){
               if (obj.getDate().compareTo(soonerEntry)){
                   soonerEntry = obj.getDate();
               }
           }
           return soonerEntry;
       }
    }


}
