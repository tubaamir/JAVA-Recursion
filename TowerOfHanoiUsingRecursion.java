/*  This is a simple program which solves the problem of tower of hanoi
 *    |    |    |
 *    |    |    |
 *    |    |    |
 *  ---------------
 */
// time complexity  O(2^n)   
//T(n) = 2T(n-1) + 1  ==> O(2^n - 1)  ==>  O(2^n)

import java.util.Scanner;
public class TowerOfHanoiUsingRecursion {
    public static void towerOfHanoi(int n,  String src, String helper, String dest) {

        //base case
        if ( n == 1 ) {
            System.out.println("Transfer disc "+ n +" from "+ src +" to "+ dest);
            return;
        }

        //working
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer disc "+ n +" from "+ src +" to "+ dest);
        towerOfHanoi(n-1, helper, src, dest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input number of discs
        System.out.println("enter the number of discs: ");
        int n = sc.nextInt();

        //recursion function
        towerOfHanoi(n, "S", "H", "D");

        sc.close();
    }
}