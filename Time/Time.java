package Time;

public class Time {
    int hour;
    int minute;
    int second;

    //constructor
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //getters and setters
    public int getHour() {
        return hour;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }
    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {

        //if hour is only one number, adds a zero infront of it (01)
        String zerohour = "0";
        if (String.valueOf(hour).length() < 2) {
            
            zerohour = "0" + String.valueOf(hour); 
            
        } else {
            zerohour = String.valueOf(hour);
        }

        //if minute is only one number, adds a zero infront of it (01)
        String zerominute = "0";
        if (String.valueOf(minute).length() < 2) {
            
            zerominute = "0" + String.valueOf(minute); 
            
        } else {
            zerominute = String.valueOf(minute);
        }

        //if second is only one number, adds a zero infront of it (01)
        String zerosecond = "0";
        if (String.valueOf(second).length() < 2) {
            
            zerosecond = "0" + String.valueOf(second); 
            
        } else {
            zerosecond = String.valueOf(second);
        }

        return zerohour + ":" + zerominute + ":" + zerosecond;
    }

    public Time nextSecond() {
        second += 1;
        return this;
    }

    public Time previousSecond() {
        second -= 1;
        return this;
    }
}
