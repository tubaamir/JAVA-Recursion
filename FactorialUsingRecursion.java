import java.util.Scanner;

public class FactorialUsingRecursion {
    public static void factorialOfNumber(int n) {
        
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
        int num = sc.nextInt();
        
        factorialOfNumber(num);
        sc.close();
    }
}