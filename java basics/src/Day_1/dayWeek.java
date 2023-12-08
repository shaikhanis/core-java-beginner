package Day_1;

import java.util.Scanner;

// . Write a program to convert days into years, weeks and days.{Hint: Input-373 days Output-1Year,1Weak,1
//day}
public class dayWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your days");
        int days = sc.nextInt();
        int years = (days /365);
        int weeks = (days %365)/7;
        days =(days %365)%7;

        System.out.println("Year/s = " + years);
        System.out.println("Week/s = " + weeks);
        System.out.println("Day/s  = " + days);
    }
}
