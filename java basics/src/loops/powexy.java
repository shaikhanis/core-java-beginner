package loops;

import java.util.Scanner;

public class powexy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the value of x ");
        int x = sc.nextInt();
        System.out.println(" Enter the value of  y ");
        int y = sc.nextInt();
        int p = 1;
        int i = 1;

        while (i <=y) {
            p = p*x;
            System.out.println("power of any number x ^ y  " + p);
            i++;
        }
    }
}
