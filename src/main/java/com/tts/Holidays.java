package com.tts;

public class Holidays {
    private String name;
    private String month;
    private int date;

    public Holidays(String name, String month, int date) {
        this.name = name;
        this.month = month;
        this.date = date;
    }

    public Holidays(){
        name = "";
        month = "";
        date = 0;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getMonth()
    {
        return month;
    }

    public void setMonth(String month)
    {
        this.month = month;
    }

    public int getDate()
    {
        return date;
    }

    public void setDate(int date)
    {
        this.date = date;
    }

    String result = (date < 31) ? "Good answer." : "Not a real date.";


}
