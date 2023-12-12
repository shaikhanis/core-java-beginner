package loops;

import java.util.Scanner;

public class AdditionOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter number");
        int number  = sc.nextInt(), sum =0;

//        while (number !=0){
//            sum = sum + number%10;
//
//            number = number/10;
//
//        }

        for (int i=1; i<=number; i++){
            sum = sum+ number%10;
            number = number/10;
        }

        System.out.println(sum+1);
    }
}
