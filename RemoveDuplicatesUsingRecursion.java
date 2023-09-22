//This program will remove all the duplicates elements that are present in a string input by user 
//and prints the new string with no duplicates values
// time complexity  ==>  O(n)

import java.util.Scanner;
public class RemoveDuplicatesUsingRecursion {
    public static boolean[] map = new boolean[26];

    public static void removeDuplicateElement (String str, int index, String newstr) {
        
        //base case
        if ( index == str.length() ) {
            System.out.println(newstr);
            return;
        }

        //working
        char currChar = str.charAt(index);
        if ( map[currChar - 'a'] ){
            removeDuplicateElement(str, index+1, newstr);
        } else {
            newstr += currChar;
            map[currChar - 'a' ] = true;
            removeDuplicateElement(str, index+1, newstr);
        } 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input string
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        //recursion function calling
        removeDuplicateElement(str, 0, "");
        sc.close();
    }
}