package Day_1;

import java.util.*;

public class simpleIntrest {
    // Write a program to enter P, T, and R and calculate Simple Interest
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" principle amount ");
        int P = sc.nextInt();
        System.out.println(" Time Or Duration  ");
        int T = sc.nextInt();
        System.out.println(" Interest rate  ");
        int R = sc.nextInt();

        System.out.println(" Simple Interest is ");

        int Interest = P*T*R/100;

        System.out.println(Interest);
    }
}
