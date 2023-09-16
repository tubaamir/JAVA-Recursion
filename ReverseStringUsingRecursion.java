/* This program will reverse the string taking from user input
 *     abcd = dcba
 *     Time complexity  ==>  O(n)  
 *           where n = length of string
 */

import java.util.Scanner;
public class ReverseStringUsingRecursion {
    
    public static void reverseString (String str, int index) {
        //base case
        if (index == 0) {
            System.out.println(str.charAt(index));
            return;
        }
        
        //working
        System.out.println(str.charAt(index));
        reverseString(str, index-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input
        System.out.println("Enter you string:  ");
        String str = sc.nextLine();

        //recursiom function
        reverseString(str, str.length()-1);

        sc.close();
    }
}