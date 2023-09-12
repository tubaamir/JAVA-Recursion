//This program will print the numbers from 1 to n

import java.util.Scanner;

public class PrintingNos1_nUsingRecursion {
    
    public static void printingNos (int x, int n) {
        //base case
        if (x == n+1) {
            return;
        }

        //printing
        System.out.println(x);

        //recursion function calling itself
        printingNos(x+1, n);
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        //input value
        System.out.println("Enter the number: ");
        int y = sc.nextInt();

        //calling printing function
        printingNos(1, y);
        
        sc.close();
    }
}
