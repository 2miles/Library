import java.util.Scanner;

//This file contains the Util class implementation
//Contains utility functions used throughout the program

import java.util.Scanner;

public class Util {

    protected Scanner input;

    //default constructor
    public Util() {
        input = new Scanner(System.in);
    }

    //get yes or no from user

    public boolean Again(String prompt)
    {
        System.out.println(prompt);
        String response = new String();
        response = input.next();
        input.nextLine();

        return ( response.toUpperCase().equals("YES") ||
                response.toUpperCase().equals("Y") );
    }

    //clears the screen
    public void clearScreen() {
        for (int i = 0; i < 50; ++i) System.out.println();
    }



    //returns the argument string, with the given index uppercase
    private static String upperCaseOneChar(String text, int i)
    {
        text = text.substring(0, i) + text.substring(i, i + 1).toUpperCase() + text.substring(i + 1);
        return text;
    }
    //returns the argument string, with the given index lowercase
    public static String lowerCaseOneChar(String text, int i)
    {
        text = text.substring(0, i) + text.substring(i, i + 1).toLowerCase() + text.substring(i + 1);
        return text;
    }


    //Returns argument string with the first letter of each word capitalized
    public static String toTitleCase(String text) {

        boolean upper = false;
        if (text== null || text.isEmpty())
            return text;

        //uppercase first letter of title
        text = upperCaseOneChar(text, 0);

        if(text.length() == 1)
            return text;
        //uppercase first char of every word
        //lowercase every other char in every word
        for (int i = 1; i < text.length() - 1; ++i) {
            if (text.charAt(i) == 32 || text.charAt(i) == '.') {
                text = upperCaseOneChar(text, i + 1);
                upper = true;
            }
            else {
                if(!upper) { text = lowerCaseOneChar(text, i); }
                else { upper = false;}
            }

        }
        if(text.charAt(text.length() - 2) == '.')
            text = upperCaseOneChar(text, text.length() - 1);
        else
            text = lowerCaseOneChar(text, text.length() - 1);
        return text;
    }

    /*
public static void main(String[] args) {

    String miles = "miles whitaker";
    System.out.println(miles);
    miles = upperCaseOneChar(miles,0);
    System.out.println(miles);

}
    */

}
