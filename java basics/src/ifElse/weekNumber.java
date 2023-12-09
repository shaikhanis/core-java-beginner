package ifElse;

//Write a program to input week number and print week day.

import java.util.Scanner;

public class weekNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number");
        int weekN = sc.nextInt();

        int sun=1, mon =2, tue=3, wen=4, thu=5, fri=6, sat=7;

        if(weekN ==  1){
            System.out.println("sunday");
        } else if (weekN == 2) {
            System.out.println("monday");
        } else if (weekN == 3) {
            System.out.println("tuesday");
        } else if (weekN == 4) {
            System.out.println("wensday");
        } else if (weekN == 5) {
            System.out.println("thusday");
        } else if (weekN == 6) {
            System.out.println("friday");
        } else if (weekN == 7) {
            System.out.println("saterday");
        }else
            System.out.println("invalid number");
    }

}
