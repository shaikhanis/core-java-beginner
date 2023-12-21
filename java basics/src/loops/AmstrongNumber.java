package loops;

import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt(), length =0;
        int n1 = number;
        while (n1!=0){
            n1 = n1/10;
            length++;
        }

        int n2=number;
        int sum=0;

        while (n2!=0) {

            int mul=1;
            int rem = n2%10;
            n2 = n2/10;

            rem =(int) Math.pow(rem,length);
            mul = mul*rem;

            sum+=mul;
        }
        if(sum==number){
            System.out.println("number is armstrong ");
        }else {
            System.out.println("number is not armstrong ");
        }
    }
}
