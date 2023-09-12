//This program will print the sum of first n natural numbers

import java.util.Scanner;

public class SumOfnUsingRecursion {
    public static void sumOfN (int x, int n, int sum) {
        
        //base case
        if (x == n) {
            sum += x;
            System.out.println(sum);
            return;
        }
        sum += x;
        
        //recursion
        sumOfN(x+1, n, sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        sumOfN(1, n, 0);

        sc.close();
    }
}