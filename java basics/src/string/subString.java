package string;

import java.util.Scanner;

public class subString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter some random name here ");
        String S = sc.nextLine();
        System.out.println("enter where to start & print the string");
        int s = sc.nextInt();
        System.out.println("enter where to end & print the string");
        int e = sc.nextInt();

        // this method is used for reducing the all extra spaces
        S = S.replaceAll(" " , "");

        System.out.println(S);
        char [] ch = new char[S.length()];

        for (int i=0; i<S.length(); i++){
            ch[i] = S.charAt(i);
        }

        for (int i=s; i<e; i++){
            System.out.print(ch[i]);
        }
    }
}
