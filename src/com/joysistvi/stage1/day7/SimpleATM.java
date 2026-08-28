package com.joysistvi.stage1.day7;

import java.util.Scanner;

public class SimpleATM {
    public static void main(String[] args) {
        // Scanner object for reading user input
        Scanner input = new Scanner(System.in);

        double balance = 5000.00; // starting balance

        // Display the ATM menu
        System.out.println("=== SIMPLE ATM MENU ===");
        System.out.println("1 - Check Balance");
        System.out.println("2 - Deposit");
        System.out.println("3 - Withdraw");
        System.out.println("4 - Exit");
        System.out.print("Enter choice (1-4): ");
        int choice = input.nextInt(); // store the user's menu choice

        // Switch statement to determine which action to perform
        switch (choice) {
            case 1:
                // Check Balance
                System.out.println("Your current balance is: " + balance);
                break;

            case 2:
                // Deposit
                System.out.print("Enter amount to deposit: ");
                double depositAmount = input.nextDouble();

                // Nested if: validate that the deposit amount is valid
                if (depositAmount <= 0) {
                    System.out.println("Invalid amount. Deposit must be greater than zero.");
                } else {
                    balance += depositAmount; // add deposit to balance
                    System.out.println("Deposit successful. New balance: " + balance);
                }
                break;

            case 3:
                // Withdraw
                System.out.print("Enter amount to withdraw: ");
                double withdrawAmount = input.nextDouble();

                // Nested if: validate that the withdrawal amount is valid
                if (withdrawAmount <= 0) {
                    System.out.println("Invalid amount. Withdrawal must be greater than zero.");
                } else {
                    // Nested if inside nested if: check if balance is sufficient
                    if (withdrawAmount > balance) {
                        System.out.println("Insufficient balance. Your current balance is: " + balance);
                    } else {
                        balance -= withdrawAmount; // deduct withdrawal from balance
                        System.out.println("Withdrawal successful. New balance: " + balance);
                    }
                }
                break;

            case 4:
                // Exit
                System.out.println("Thank you for using Simple ATM. Goodbye!");
                break;

            default:
                // Runs if choice is not 1-4
                System.out.println("Invalid choice. Please select 1-4.");
        }

        input.close(); // close the Scanner to release resources
    }
}
