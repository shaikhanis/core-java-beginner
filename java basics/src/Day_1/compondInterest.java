package Day_1;

import java.util.Scanner;

//Write a program to enter P, T, and R and calculate Compound Interest.
//P is the principal amount
//R is the rate and
//T is the time span
public class compondInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();

        double A = p*(Math.pow((1+r/100),t));

        double CI = A-p;

        System.out.println("compond Interest is " + CI);
    }
}
