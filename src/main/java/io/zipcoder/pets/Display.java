package io.zipcoder.pets;

import java.util.Scanner;

/**
 * Created by latashawatson on 1/30/17.
 */
public class Display {
    Scanner scanner;

    public Display() {
        scanner = new Scanner(System.in);
    }

    private void flush() {
        scanner.nextLine();
    }

    public String promptUserForString(String prompt) {
        flush();
        System.out.println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public int promptUserForInteger(String prompt) {
        flush();
        System.out.println(prompt);
        int userInput = scanner.nextInt();
        return userInput;
    }
}
