package com.company;

public class Finsk implements Dialog{

    private String s ="Suomalainen";

    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "poistu painamalla q";
    }

    @Override
    public String selectedLanguage() {
        return "Olet valinnut kielen suomi";
    }

    @Override
    public String Flag() {
        return "lippumme on valkoinen ja sininen";
    }

    @Override
    public String selectedFlag() {
        return "Haluatko nähdä Suomen värit?";
    }
}
