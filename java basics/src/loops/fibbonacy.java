package loops;

 /* Problem statement.
        WAP to generate Fibonacci series in forward and reverse order. Take number of terms to print from
console. Series for 8 terms will be as follows : 0, 1, 1, 2,3,5,8,13 and 13,8,5,3,2,1,1,0
         */

import java.util.Scanner;

public class fibbonacy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number How long You Print The Series");
        int n = sc.nextInt();
        int a=0, b=1, c=0;
        for (int i=0; i<n; i++){
             c= a+b;
             a=b;
             b=c;
            System.out.println(c);
        }

        System.out.print(" The revers fibonacci series is ");

        for (int i=0; i<=n; i++){
            System.out.println(b + " ");

            c= b-a;
            b=a;
            a=c;
        }
    }
}
