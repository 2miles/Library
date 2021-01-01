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

    public boolean Again(String prompt) {
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


}
