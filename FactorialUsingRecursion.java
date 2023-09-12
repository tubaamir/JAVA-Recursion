//This program finds the factorial of a number

import java.util.Scanner;

public class FactorialUsingRecursion {
    public static void factorialOfNumber(int n) {
        
        //Base case
        if (n < 0) {
            System.out.println("Invalid Input!");
            return;
        }
        
        int factorial = 1;
        for (int i=n; i>=1; i--) {
            factorial = factorial * i;
        }
        
        System.out.print("Factorial of a number is ");
        System.out.println(factorial);
        return;
    }

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        //input number 
        int num = sc.nextInt();
        
        //calling function
        factorialOfNumber(num);
        sc.close();
    }
}
