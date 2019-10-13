package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date {
    // TODO 2:  Design a Date class that takes a month, day and year in the constructor.
    // You should have getters for the date in a short format (DD-MM-YY or MM/DD/YYYY, for example) and
    // in a longer String format (e.g. January 1, 2017). Optional: If you like, you can also get creative
    // ith algorithms to determine the day of the week, or add *st, *nd, *rd, *th (ordinal indicators) to the end of
    // numbers.


    /**
     * private attribute for holding day
     */
    private int day;

    /**
     * private attribute for holding month
     */
    private int month;

    /**
     * private attribute for holding year
     */
    private int year;

    /**
     * create getters for Day, Month and Year
     */
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    // Default Constructor
    public Date() {
        Calendar currentDate = Calendar.getInstance(); //Get the current date
        java.util.Date x = currentDate.getTime();
        SimpleDateFormat formatyear = new SimpleDateFormat("yyyy");
        this.year = Integer.parseInt(formatyear.format(x));
        SimpleDateFormat formatmonth = new SimpleDateFormat("MM");
        this.month = Integer.parseInt(formatmonth.format(x));
        SimpleDateFormat formatdd = new SimpleDateFormat("dd");
        this.day = Integer.parseInt(formatdd.format(x));
    }

    /**
     * Constructor that takes year/month/day
     * @param year
     * @param month
     * @param day
     * @throws IllegalArgumentException if invalid
     */
    public Date(int year, int month, int day) throws IllegalArgumentException{
        if (!isValid(year, month, day)) throw new IllegalArgumentException();
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /**
     * Check if given year/month/day is valid
     * @param year
     * @param month
     * @param day
     * @return true if it is valid date
     */
    public static boolean isValid(int year, int month, int day) {
        if (year < 0) return false;
        if ((month < 1) || (month > 12)) return false;
        if ((day < 1) || (day > 31)) return false;
        switch (month) {
            case 1: return true;
            case 2: return (isLeap(year) ? day <= 29 : day <= 28);
            case 3: return true;
            case 4: return day < 31;
            case 5: return true;
            case 6: return day < 31;
            case 7: return true;
            case 8: return true;
            case 9: return day < 31;
            case 10: return true;
            case 11: return day < 31;
            default: return true;
        }
    }

    /**
     * Check given year is leap year
     * @param year
     * @return true if year is leap year
     */
    public static boolean isLeap(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * Compare two dates
     *
     * @param d Date
     * @return true if it is earlier than d
     */
    public boolean compareTo(Date d) {
        int day1 = d.getDay();
        int month1 = d.getMonth();
        int year1 = d.getYear();
        return (this.year <= year1) && (this.month <= month1) && (this.day <= day1);
    }

    /**
     * return a string representation
     * convert to ISO 8601 Date Format
     * http://en.wikipedia.org/wiki/ISO_8601
     *
     * @return
     */
    public String toShort() {
        StringBuilder s = new StringBuilder();
        s.append(String.valueOf(this.year));
        s.append("-");
        if (this.month < 10) s.append("0");
        s.append(String.valueOf(this.month));
        s.append("-");
        if (this.day < 10) s.append("0");
        s.append(String.valueOf(this.day));
        return String.valueOf(s);
    }

    /**
     * return a long string representation
     * convert to ISO 8601 Date Format
     * http://en.wikipedia.org/wiki/ISO_8601
     *
     * @return
     */

    public String toLong() {
        StringBuilder s = new StringBuilder();
        switch (this.month) {
            case 1:
                s.append("January ");
                break;
            case 2:
                s.append("February ");
                break;
            case 3:
                s.append("March ");
                break;
            case 4:
                s.append("April ");
                break;
            case 5:
                s.append("May ");
                break;
            case 6:
                s.append("June ");
                break;
            case 7:
                s.append("July ");
                break;
            case 8:
                s.append("August ");
                break;
            case 9:
                s.append("September ");
                break;
            case 10:
                s.append("October ");
                break;
            case 11:
                s.append("November ");
                break;
            case 12:
                s.append("December ");
                break;
            default:
                s.append("");
        }


        s.append(String.valueOf(this.day));
        switch (this.day) {
            case 1:
                s.append("st, ");
                break;
            case 2:
                s.append("nd, ");
                break;
            case 3:
                s.append("rd, ");
                break;
            default:
                s.append("th, ");
                break;
        }
        s.append(String.valueOf(this.year));
        return String.valueOf(s);

    }


}






