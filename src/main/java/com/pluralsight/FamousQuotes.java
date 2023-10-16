package com.pluralsight;
import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        Scanner myscan = new Scanner(System.in);

        try {
            String[] quotes = {
                    "You can do it", "Don't judge a book by its cover", "You are unique", "Respect others", "Treat Carefully",
                    "Treat others how you want to be treated", "You matter", "The banana bus", "Who are you to me", "Autobots roll out!"
            };
            System.out.print("Select a number between 1-10 for a quote:");
            int index = myscan.nextInt();
            index --;
            System.out.println(quotes[index]);
        } catch (Exception e) {
            System.out.println("This output was not asked for!");
            e.printStackTrace();
        }
        myscan.close();
    }
}
