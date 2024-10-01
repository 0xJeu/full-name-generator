package com.plurasight;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your name ");

        System.out.print("First name: ");
        String firstName = keyboard.nextLine().trim();

        System.out.print("Middle name: ");
        String middleName = keyboard.nextLine().trim();

        System.out.print("Last name: ");
        String lastName = keyboard.nextLine().trim();

        System.out.print("Suffix: ");
        String suffix = keyboard.nextLine().trim();

        String fullName;

        if (middleName.isEmpty()){
            fullName = firstName + " " + lastName;
        }else {
            fullName = firstName + " " + middleName + " " + lastName;
        }

        if (!suffix.isEmpty()){
            fullName += ", " + suffix;
        }

        System.out.println(fullName);



    }
}
