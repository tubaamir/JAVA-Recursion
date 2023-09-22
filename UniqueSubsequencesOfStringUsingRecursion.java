//prints all the unique subsequences of a string by input from user
/*Time complexity    ==>  O()
*     aaa    ==>
*     subsequences =  (aaa, aa, a)
*/

import java.util.HashSet;
import java.util.Scanner;
public class UniqueSubsequencesOfStringUsingRecursion {
    
    public static void uniqueSubsequences (String str, int index, String newstr, HashSet<String> set) {
        if ( index == str.length() ){
            if ( set.contains(newstr) ) {
                return;
            } else {
                System.out.println(newstr);
                set.add(newstr);
                return;
            }
        }

        char currChar = str.charAt(index);

        //char want to be in a string
        uniqueSubsequences(str, index+1, newstr+currChar, set);
        //not to be
        uniqueSubsequences(str, index+1, newstr, set);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input string
        System.out.println("Enter the string: ");
        String str  = sc.nextLine();

        //hashset initialization
        HashSet<String> set = new HashSet<>();

        //recursion function cslling
        uniqueSubsequences(str, 0, "", set);
        sc.close();
    }
}