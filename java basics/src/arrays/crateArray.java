package arrays;

import java.util.Scanner;

public class crateArray {
    // hot to create array and access this array.
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);
        System.out.println(arr[6]);
        System.out.println(arr[7]);

//        for (int i=0; i<arr.length; i++){
//            System.out.print(arr[i] + ",");
//        }
        // both work same but this is using for each loop
        for (int j : arr) {
            System.out.print(j + ",");
        }
        System.out.println();
        // hot to create arr by user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Arr Size");
        int size  = sc.nextInt();

        int [] array = new int[size];
        System.out.println("Enter Array Element");
        for (int i=0; i<size; i++){
            array [i] = sc.nextInt();
        }
        for (int j : array) {
            System.out.println(j);
        }
    }
}
