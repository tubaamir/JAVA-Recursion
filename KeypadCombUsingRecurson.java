//printing keypad combination
/* if inpu 23
 * possible comb
 *  d - {"dg", "dh", "di"}
 *  e - {"eg", "eh", "ei"}
 *  f - {"fg", "fh", "fi"}
*/

import java.util.Scanner;
public class KeypadCombUsingRecurson {
    //initializin keypad
    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printComb (String str, int index, String comb) {

        //base case
        if ( index == str.length() ) {
            System.out.println(comb);
            return;
        }

        //working
        char currChar = str.charAt(index);
        String mapping = keypad [ currChar - '0'];
        for (int i=0; i<mapping.length(); i++) {
            printComb(str, index+1, comb+mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input numbers as string
        System.out.println("Enter the numbers: ");
        String str = sc.nextLine();
        
        //recursion function calling
        printComb(str, 0, "");
        sc.close();
    }    
}