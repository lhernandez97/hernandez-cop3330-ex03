/*
* UCF COP3330 Fall 2021 Assignment 1 Solution
* Copyright 2021 Luis Hernandez
*/

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        //create a Scanner
        Scanner input = new Scanner(System.in);
        //prompt the user for a quote
        System.out.print("What is the quote? ");
        String quote = input.nextLine();
        //prompt the user to input who said the quote
        System.out.print("Who said it? ");
        String name = input.nextLine();
        //output the quote and who said it
        System.out.printf("%s says, \"%s\"", name, quote);
    }
}
