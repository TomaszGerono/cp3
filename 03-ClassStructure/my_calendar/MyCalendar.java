package my_calendar;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MyCalendar {
    static int year = 2023;
    static int month = 4;
    static int day = 9;

    static LocalDate date = LocalDate.of(year, month, day);

    static int days() { 
        // returns number of days that have 
        // passed since the beginning of the year

        LocalDate beginningOfYear = LocalDate.of(year,1,1);
        return (int) ChronoUnit.DAYS.between(beginningOfYear, date);
    }

    static String myDate() {
        // returns date as a string in the format yyyy-mm-dd
        return date.toString();
    }

    static String monthName() {
        // returns the name of the month

        String firstLetterCapitalised = date.getMonth().toString().substring(0,1);
        String restOfString = date.getMonth().toString().substring(1).toLowerCase();

        return firstLetterCapitalised + restOfString;
    }
}