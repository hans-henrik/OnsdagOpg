package com.company;

public class English implements Dialog{

    private String s = "English";
    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "press q to quit";
    }

    @Override
    public String selectedLanguage() {
        return "the selected language is ";
    }

    @Override
    public String Flag() {
        return "Our flag is red and blue and white";
    }

    @Override
    public String selectedFlag() {
        return "Do you wanna see the colors of St George's Cross ";
    }

    @Override
    public String toString() {
        return "English{" +
                "s='" + s + '\'' +
                '}';
    }
}
