//   *** IMPORTANT ***
//prints all the subsequences of a string by user input
//Time complexity   ==>  O(2^n)
/*     abc
 *             a                         _   
 *          /     \                  /       \
 *         /       \                /         \
 *       ab         a_            _b           __
 *      /  \       /  \          / \          /  \
 *   abc   ab_   a_c   a__    _bc   _b_   _ _c    _ _ _
*/

import java.util.Scanner;

public class SubsequencesOfStringUsingRecursion {
    public static void subsequence (String str, int index, String newstr ) {
        //base case
        if (index == str.length() ){
            System.out.println(newstr);
            return;
        }

        char currChar = str.charAt(index);
        
        //to be
        subsequence(str, index+1, newstr+currChar);

        //not to be
        subsequence(str, index+1, newstr);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input string
        System.out.println("Enter the string: ");
        String str  = sc.nextLine();

        subsequence(str, 0, "");
        sc.close();
    }
}
