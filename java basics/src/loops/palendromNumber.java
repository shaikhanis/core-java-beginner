package loops;

import java.util.Scanner;

public class palendromNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Number");
        int number = sc.nextInt();
        int num =number;
        int rev=0, result;
        while (num!=0){
            result = num%10;
            num = num/10;
            rev = rev*10 + result;
        }
        if (number == rev){
            System.out.println(" given number is palendrom number ");
        }else {
            System.out.println("number is not palendrom");
        }
    }
}
