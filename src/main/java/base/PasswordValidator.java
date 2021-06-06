/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Arya Hirode
 */
package base;

import java.util.Scanner;

public class PasswordValidator {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        PasswordValidator myApp = new PasswordValidator();
        myApp.output();
    }

    private String usernamePrompt() {
        System.out.print("What is your username? ");
        return in.nextLine();
    }

    private String passwordPrompt() {
        System.out.print("What is the password? ");
        return in.nextLine();
    }

    private void output() {
        String password = "abc$123";
        String inputUsername = usernamePrompt();
        String inputPassword = passwordPrompt();
        if(inputPassword.equals(password)) {
            System.out.println("Welcome!");
        }
        else {
            System.out.println("I don't know you.");
        }
    }
}
