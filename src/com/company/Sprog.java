package com.company;

import java.util.HashMap;
import java.util.Map;

public class Sprog  {

    private HashMap<String, Dialog> dialoger = new HashMap<>();

    public HashMap<String, Dialog> getDialoger() {
        return dialoger;
    }

    public Sprog() {


        // her tilføjer du ny sprog
        dialoger.put("da", new Dansk());
        dialoger.put("eng", new English());
        dialoger.put("por", new Portugisisk());
        dialoger.put("fin", new Finsk());
        dialoger.put("sve", new Svensk());
    }

    public Dialog SkiftSprog(String s) {

       return dialoger.getOrDefault(s, new English());

    }

    @Override
    public String toString() {
        return "Sprog{" +
                "dialoger=" + dialoger +
                '}';
    }

    public void getSprog() {
        System.out.println("The diffrent langues to select from :");
        for (Map.Entry me : dialoger.entrySet()) {
            System.out.println("Type: " + me.getKey() + " || to select this language ");
        }


    }


}


