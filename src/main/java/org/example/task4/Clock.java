package org.example.task4;

public class Clock implements Readable {
   private int hour;
   private int minute;
   private int second;

    public void setTime (int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String getTime () {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String tick() {
        int newSecond = (this.second + 1) % 60;
        int newMinute = (this.minute + (this.second + 1) / 60) % 60;
        int newHour = (this.hour + (this.minute + (this.second + 1) / 60) / 60) % 24;

        return String.format("%02d:%02d:%02d", newHour, newMinute, newSecond);
    }
@Override
   public void readTime () {
        System.out.println(String.format("Текущее время: %02d:%02d:%02d", this.hour, this.minute, this.second));
        System.out.println("Время через секунду: " + tick());
}
}
