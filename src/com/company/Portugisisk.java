package com.company;

public class Portugisisk implements Dialog{

private String s = "portugisisk";

    @Override
    public String getLanguage() {
        return s;
    }

    @Override
    public String quit() {
        return "pressione q para parar";
    }

    @Override
    public String selectedLanguage() {
        return "o idioma selecionado é";
    }

    @Override
    public String Flag() {
        return "nossas bandeiras são verdes, vermelhas, amarelas, brancas e azuis";
    }

    @Override
    public String selectedFlag() {
        return "vais ver as cores de uma Bandeira de Portugal?";
    }

    @Override
    public String toString() {
        return "Portugisisk{" +
                "s='" + s + '\'' +
                '}';
    }
}
