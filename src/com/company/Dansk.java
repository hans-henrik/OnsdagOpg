package com.company;

public class Dansk implements Dialog {

    private String s = "danish";

    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "tryk q for at stoppe ";
    }

    @Override
    public String selectedLanguage() {
        return "det valgte sprog er ";
    }

    @Override
    public String Flag() {
        return "vores flag er rødt og hvidt";
    }

    @Override
    public String selectedFlag() {
        return "Vil du se farverne på Dannebrog?";
    }
}