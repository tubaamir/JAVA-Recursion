// check whether the given array is sorted

public class CheckArraySortedUsingRecursion {

    //initialzing array
    static int array[] = {1, 2, 3};

    //recurasion function
    public static void checkFn ( int index ) {
        //base case
        if (array[index] == array.length){
            System.out.println("sorted");
            return;
        } 
        //function
        else {
            if (array[index] < array[index+1] ) {
                //function calling itself
                checkFn(index+1);
            } 
        } 
    }

    public static void main(String[] args) {
        //recursion funnction calling
        checkFn(0);
    }
}