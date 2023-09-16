//This program will calculate the power of any number using recursion

import java.util.Scanner;
public class CalcPowerUsingRecursion  {
    public static int CalcPower (int x, int n) {
        //base cases
        if (  n == 0 ) {
            return 1;
        }
        if ( x == 0 ) {
            return 0;
        }

        //working
        int powern = CalcPower(x, n-1);
        int xpowern = x * powern;
        return xpowern;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input
        System.out.println("enter value of x :");
        int x = sc.nextInt();
        System.out.println("enter the value of n : ");
        int n = sc.nextInt();

        //recursion function
        int ans = CalcPower (x, n);
        System.out.println(x+" to the power "+n+" is "+ans);
        sc.close();
    }
}