package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Dialog dialog = new English();

        Sprog sprog = new Sprog();

        while (!   getString(dialog.quit() ).equalsIgnoreCase("q") )  {


            if(getString("change language ?").equalsIgnoreCase("y")) {
                System.out.println("type the following names change language :");

                dialog = sprog.SkiftSprog(getString("da / eng / fin / sve / Por"));

            }
            System.out.println(dialog.selectedLanguage() + " " + dialog.getLanguage());
            if (getString(dialog.selectedFlag()).equalsIgnoreCase("y")) {
                System.out.println(dialog.Flag());
            }
        }


    }

    public static String getString(String s) {

        Scanner scanner = new Scanner(System.in);

        System.out.print(s + " : ");

        return scanner.nextLine();

    }
}
