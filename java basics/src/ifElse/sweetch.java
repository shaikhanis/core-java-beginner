package ifElse;

import java.util.Scanner;

public class sweetch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("inter Number");
        int day = sc.nextInt();

        //switch (day) {
        //            case 1 -> System.out.println("monday");
        //            case 2 -> System.out.println("tuesday");
        //            case 3 -> System.out.println("wensday");
        //            case 4 -> System.out.println("thusday");
        //            case 5 -> System.out.println("friday");
        //            case 6 -> System.out.println("saterday");
        //            case 7 -> System.out.println("sunday");
        //            default -> System.out.println("invalid");
        //        }

        switch (day){
            case 1:
                System.out.println("monday");
                break;

            case 2:
                System.out.println("tuesday");
                break;

            case 3:
                System.out.println("wensday");
                break;

            case 4:
                System.out.println("thusday");
                break;

            case 5:
                System.out.println("friday");
                break;

            case 6:
                System.out.println("saterday");
                break;

            case 7:
                System.out.println("sunday");
                break;

            default:
                System.out.println("invalid");
        }
    }
}
