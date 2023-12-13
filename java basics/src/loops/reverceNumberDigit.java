package loops;

import java.util.Scanner;

// write a program to enter number from user and reverce this number

public class reverceNumberDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = sc.nextInt();

        int reverse =0,result;

        while (number != 0)

        {
            result = number%10;
            number = number/10;
            reverse = reverse *10 +result;

        }
        System.out.println(reverse);
    }
}
