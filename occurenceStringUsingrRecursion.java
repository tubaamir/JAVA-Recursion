// This program will print the first and last occurence of an element in an string
/*    string = aabbccaaa
 *    a frist = 0   last = 7
 *    Time complexity  ==>  O(n) 
 *             where n = string length
 */

import java.util.Scanner;
public class occurenceStringUsingrRecursion {
    static int first = -1;
    static int last = -1;

    public static void countOccurence (String str, int index, char element) {
        //base case
        if ( index == str.length() ) {
            System.out.println(first);
            System.out.println(last);
            return;
        }

        //working
        char currChar = str.charAt(index);
        if ( currChar == element ) {
            if ( first == -1 ) {
                first = index;
            } else {
                last = index;
            }
        }
        countOccurence(str, index+1, element);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println("Enter the element: ");
        char c = sc.next().charAt(0);

        //recursion function
        countOccurence(str, 0, c);

        sc.close();
    }
}