package com.joysistvi.stage1.day8;

import java.util.Scanner;

public class WhileLoopStatement {

    public static void main(String[] args) {

        // [Syntax]

        /*
            initialization
            while (condition) {
                statement / body of the loop
                inc / dec
            }
         */




        Scanner scanner = new Scanner(System.in);

        boolean isRunning = false;

        while (!isRunning) {
            System.out.print("Type 'exit' to stop: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Program stopped!");
                isRunning = true;
            }

        }

        // flag -> used to track / mark a variable whether a specific condition or event has occurred

    }
}

/*

    While loop - Used when the number of repetition is unknown in advance

    .// Print numbers from 1 - 10
    int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
 */


/*
    Scanner scanner = new Scanner(System.in);

        String email = "winter@gmail.com";
        String password = "winter123";

        boolean isLoggedIn = false;
        while (!isLoggedIn) {
            System.out.print("Enter email: ");
            String loginEmail = scanner.nextLine();

            System.out.print("Enter password: ");
            String loginPass = scanner.nextLine();

            if (loginEmail.equals(email) && loginPass.equals(password)) {
                System.out.println("Login Successfully!");

                isLoggedIn = true; // stop the while loop
            } else {
                System.out.println("Invalid Username or Password!");
            }
        }
 */