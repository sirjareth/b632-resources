package com.joysistvi.stage1.day7;

import java.util.Scanner;

public class NestedIfStatement {

    public static void main(String[] args) {
        // [Section] Syntax of Nested If Statement

        /*
            if () { outer if
                if () { inner if
                    if () {

                    }
                } else {
                    if () {

                    }
                }
            } else {
                if () {

                }
            }
         */

        // Age Categorizer
        /* Requirements
            Age: 0 - 2 Category: Baby
            Age: 3 - 12 Category: Child
            Age: 13 - 19 Category: Teenager
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("--- Age Categorizer ---");


        // Code Minization for getting the range
        // Validation

        // Age: 0 - 120
        String again = "";
        do {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            sc.nextLine();

            if (age >= 0 && age <= 120) { // Validation
                if (age <= 2) { // 0 - 2
                    System.out.println("Category: Baby");
                } else if (age <= 12) { // 3 - 12
                    System.out.println("Category: Child");
                } else if ( age <= 19) {
                    System.out.println("Category: Teenager");
                } else if (age <= 39) {
                    System.out.println("Category: Young Adult");
                } else if (age <= 59){
                    System.out.println("Category: Middle-Aged Adult");
                } else {
                    System.out.println("Category: Senior");
                }
            } else {
                System.out.println("Invalid Age! Age must be between 0 and 120");
            }

            System.out.print("\nCheck another age? (y/n): ");
            again = sc.nextLine();
        } while (again.equalsIgnoreCase("y"));

        System.out.println("Program ended.");










    }
}


/* Ternary Operator
    String category = age < 0 ? "Invalid Input" :
                age <= 2 ? "Category: Baby" :
                        age <= 12 ? "Category: Child" :
                                age <= 19 ? "Category: Teenager" :
                                        "Invalid Input";

        System.out.println(category);
 */

/*
    // inner if statement
            if (age >= 3 && age <= 6) {
                System.out.println("Preschooler");
            } else {
                System.out.println("Grade Schooler");
            }

            // inner if
            if (age >= 13 && age <= 15) {
                System.out.println("Early Teen");
            } else {
                System.out.println("Late Teen");
            }
 */


/*
    if (age >= 0 && age <= 120) { // Validation
            if (age <= 2) { // 0 - 2
                System.out.println("Category: Baby");
            } else if (age <= 12) { // 3 - 12
                System.out.println("Category: Child");
            } else if ( age <= 19) {
                System.out.println("Category: Teenager");
            } else {
                System.out.println("Invalid Input");
            }
        } else {
            System.out.println("Invalid Age! Age must be greater 0");
        }
 */