/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Vincent Smith
 */

import java.util.Scanner;
public class EX21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month;
        System.out.print("Enter the number of the month: ");
        month = input.nextInt();

        switch (month) {
            case 1 -> System.out.print("The name of the month is January ");
            case 2 -> System.out.print("The name of the month is February ");
            case 3 -> System.out.print("The name of the month is March ");
            case 4 -> System.out.print("The name of the month is April ");
            case 5 -> System.out.print("The name of the month is May ");
            case 6 -> System.out.print("The name of the month is June ");
            case 7 -> System.out.print("The name of the month is July ");
            case 8 -> System.out.print("The name of the month is August ");
            case 9 -> System.out.print("The name of the month is September ");
            case 10 -> System.out.print("The name of the month is October ");
            case 11 -> System.out.print("The name of the month is November ");
            case 12 -> System.out.print("The name of the month is December ");
            default -> System.out.print("Invalid number: ");
        }

    }
}