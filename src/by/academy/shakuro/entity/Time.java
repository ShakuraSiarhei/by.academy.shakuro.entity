package by.academy.shakuro.entity;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = (hour > 0 && hour < 24) ? hour : 0;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = (minute > 0 && minute < 60) ? minute : 0;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = (second > 0 && second < 60) ? second : 0;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }

    public void changeHours(int hour) {
        this.hour += hour;
        if (this.hour > 23) {
            this.hour -= 24;
        } else if (this.hour < 0) {
            this.hour += 24;
        }
    }

    public void changeMinutes(int minute) {
        if (minute > 0) {
            this.minute += minute;
            changeHours(this.minute / 60);
            this.minute = this.minute % 60;
        } else {
            int hour = minute / 60;
            minute = -minute + 60 * hour;
            if (this.minute < minute) {
                changeHours(--hour);
                this.minute = this.minute + 60 - minute;
            } else {
                this.minute -= minute;
                changeHours(hour);
            }
        }
    }

    public void changeSeconds(int second) {
        if (second > 0) {
            this.second += second;
            changeMinutes(this.second / 60);
            this.second = this.second % 60;
        } else {
            int minute = second / 60;
            second = -second + 60 * minute;
            if (this.second < second) {
                changeMinutes(--minute);
                this.second = this.second + 60 - second;
            } else {
                this.second -= second;
                changeMinutes(minute);
            }
        }
    }

}

class TestTime {
    public static void main(String[] args) {

        Time t2 = new Time();
        t2.setHour(0);
        t2.setMinute(0);
        t2.setSecond(1);
        t2.changeSeconds(-2);
        System.out.println(t2.toString());

    }
}
