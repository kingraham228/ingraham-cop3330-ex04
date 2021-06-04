package oop.example;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Kate Ingraham
 */
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a noun: ");
        String noun = input.next();

        System.out.println("Enter a verb (past tense): ");
        String verb = input.next();

        System.out.println("Enter an adjective: ");
        String adjective = input.next();

        System.out.println("Enter an adverb: ");
        String adverb = input.next();

        System.out.println("Enter a pronoun: ");
        String pronoun = input.next();

        System.out.println("Enter another verb (past tense): ");
        String verb2 = input.next();

        System.out.printf("Once a %s %s %s but also %s %s %s.", adjective, noun, verb2, pronoun, adverb, verb );

    }

}
