package com.company;

import java.util.Scanner;

public class Main {


        public static void main(String []args){
            Scanner Scanner = new Scanner(System.in);

            System.out.println("How is the weather? ");
            String answer = Scanner.nextLine();

            String s1 = "rainy";
            String s2 = "windy";
            String s3 = "snowy";
            String s4 = "stormy";
            String s5 = "sunny";

            if  (answer.equals(s1))                                 /*(answer == "rain")*/
                System.out.println("Take your umbrella!");
            else if (answer.equals(s2))                             /*(answer == "windy") */
                System.out.println("Wear your jacket!");
            else if (answer.equals(s3))                             /*(answer == "snow" )*/
                System.out.println("Wear a coat and take a shovel!");
            else if (answer.equals(s4))
                System.out.println("You should stay inside");
            else if (answer.equals(s5))
                System.out.println("Enjoy your day!");

    }
}
