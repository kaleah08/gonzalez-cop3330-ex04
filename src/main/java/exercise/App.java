package exercise;

/*UCF COP3330 Fall 2021 Assignment 1 Solution
Copyright 2021 Kaleah Gonzalez */

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String noun = input.next();

        System.out.print("Enter a verb: ");
        String verb = input.next();

        System.out.print("Enter an adjective: ");
        String adjective = input.next();

        System.out.print("Enter an adverb: ");
        String adverb = input.next();

        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " "+ adverb + "? That's hilarious!");

    }
}
