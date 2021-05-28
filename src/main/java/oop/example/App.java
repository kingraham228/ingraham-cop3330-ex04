package oop.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a noun: ");
        String noun = input.next();

        System.out.println("Enter a verb: ");
        String verb = input.next();

        System.out.println("Enter an adjective: ");
        String adjective = input.next();

        System.out.println("Enter an adverb: ");
        String adverb = input.next();

        System.out.println("Enter a pronoun: ");
        String pronoun = input.next();

        System.out.println("Enter another verb: ");
        String verb2 = input.next();

        System.out.printf("Once a %s %s %sed but also %s %s %sed.", adjective, noun, verb2, pronoun, adverb, verb );

    }

}
