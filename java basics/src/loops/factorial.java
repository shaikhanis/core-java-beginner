package loops;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number ");
        int num = sc.nextInt(), factorial =1;

//        for (int i=1; i<=num; i++){
//            factorial = factorial*i;
//        }
        // using while loops
        int i=1;
        while (i<=num){
            factorial = factorial*i;
            i++;
        }

        System.out.println( " Factorial of given number is " + factorial);
    }
}
