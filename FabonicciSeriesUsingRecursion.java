// This program will print fabonicci series till n

import java.util.Scanner;
public class FabonicciSeriesUsingRecursion {
    public static void FS (int a, int b, int n){
        //base case
        if ( n == 0) {
            return;
        }

        int c = a + b;
        System.out.print(c +" ");

        //function calling itself
        FS (b, c , n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n : ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a +"  "+ b +" ");

        //recursion
        FS (a, b, n-2);
        sc.close();
    }
}