//This program will print the values from n to 1

import java.util.Scanner;

public class PrintingNosUsingRecursion {
    public static void printingNos (int n) {
        //base case
        if (n == 0) {
            return;
        }

        //printing
        System.out.println(n);

        //recursion function calling itself
        printingNos(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input value
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        //calling printing function
        printingNos(n);
        
        sc.close();
    }
}