//check whether the array input by user is sorted or not
//time complexity   ==>  O(n)

import java.util.Scanner;
public class ArraySortedCheckUsingRecursion {
    public static boolean checkFn (int array[], int index) {

        //base case
        if ( index == array.length-1) {
            return true;
        }

        //working
        if (array[index] < array[index+1]) {
            return checkFn(array, index+1);
        }else {
            return false;
        }
    }
    
    public static void main (String [] ags) {
        Scanner sc = new Scanner(System.in);
        
        //input size 
        System.out.println("enter the size of array : ");
        int size = sc.nextInt();
        //input elements
        System.out.println("enter the elments of array: ");
        int array[] = new int[size];
        for (int i=0; i<size; i++) {
            array[i] = sc.nextInt();
        }
        
        //recursion function calling
        System.out.println(checkFn(array, 0));
        sc.close();
    }
}