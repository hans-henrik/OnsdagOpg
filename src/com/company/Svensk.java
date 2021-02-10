package com.company;

public class Svensk implements  Dialog {

    private String s = "Svensk";

    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "tryck på q för att sluta";
    }

    @Override
    public String selectedLanguage() {
           return "Det valda språket är";
    }

    @Override
    public String Flag() {
        return "vår flagga är blå och gul";
    }

    @Override
    public String selectedFlag() {
        return "Vill du se färgerna på den svenska flaggan?";
    }

    @Override
    public String toString() {
        return "Svensk{" +
                "s='" + s + '\'' +
                '}';
    }
}
