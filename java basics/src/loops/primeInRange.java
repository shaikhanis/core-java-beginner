package loops;

import java.util.Scanner;

public class primeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num 1");
        int num1 = sc.nextInt();
        System.out.println(" Enter num2");
        int num2 = sc.nextInt();

        int i,j, count=0;

        for ( i=num1; i<=num2; i++){
            for ( j=2; j<=i; j++){
                if (i%j == 0){
                    break;
                }
            }
            if (i == j){
                System.out.println(j);
                count = count +1;
            }
        }
        System.out.println("how many number in this range are prime is =  \n" + count );
    }
}
