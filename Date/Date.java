package Date;

public class Date {
    private int day;
    private int month;
    private int year;

    //constructor
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //getters and setters

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDate(Date date, int day, int month, int year) {
        date.day = day;
        date.month = month;
        date.year = year;

        System.out.println("Date set to: " + day + "/" + month + "/" + year);
    }

    @Override
    public String toString() {

        //if day is only one number, adds a zero infront of it (01)
        String zeroday = "0";
        if (String.valueOf(day).length() < 2) {
            
            zeroday = "0" + String.valueOf(day); 
            
        } else {
            zeroday = String.valueOf(day);
        }

        //if month is only one number, adds a zero infront of it (01)
        String zeromonth = "0";
        if (String.valueOf(month).length() < 2) {
            
            zeromonth = "0" + String.valueOf(month); 
            
        } else {
            zeromonth = String.valueOf(month);
        }

        
        return "Date: " + zeroday + "/" + zeromonth + "/" + year;
    }
}
