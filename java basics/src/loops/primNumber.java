package loops;

import java.util.Scanner;

public class primNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Number ");
        int num = sc.nextInt(), count=0;
        for (int i=1; i<=num; i++){
            if(num%i == 0){
                count  = count +1;
            }
        }
        if (count == 2){
            System.out.println("number is Prime");
        }else {
            System.out.println("number is not prime ");
        }
    }
}
