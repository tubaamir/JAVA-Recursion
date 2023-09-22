//move all particular element at the end of the string by taking user inpout
/*    string = asdfxxsdfgxxx
 *    element =x
 *    new string = asdfsdfgxxxxx
 *    i.e. moving all element x to the last of the string
 */

import java.util.Scanner;
public class MoveSimilarElementAtEndUsingRecursion {
    public static void fun (String str, String newstr1, String newstr2, int index, int element) {

        //base case
        if (index == str.length()-1) {
            System.out.print(newstr1 + newstr2);
            return;
        }

        //working
        char currchar = str.charAt(index);
        if ( currchar != element ) {
            newstr1 += currchar;
        } else {
           newstr2 += currchar;
        }

        //recursion function calling itself
        fun (str, newstr1,newstr2, index+1, element) ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //input string
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        //input element
        System.out.println("Enter the lement: ");
        char element = sc.next().charAt(0);

        String newstr1 = "";
        String newstr2 = "";

        //recursive function calling
        fun(str, newstr1, newstr2, 0, element);
        sc.close();
    }
}