package loops;

import java.util.Scanner;

//Write a program to create following number series. Print first n numbers. Accept n from user.
//1, 2, 5, 8, 13, 18, 25, 32....-
public class specialSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();
        int a=0, b=1, c=0 , count=2;

        for (int i=0; i<n; i++){
            c= a+b;
            a=c;
            count = count-1;
            if (count == 0){
                b =b + 2;
                count = 2;
            }
            System.out.print(c + ",");
        }

    }
}
