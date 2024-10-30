package my_array;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;

public class MyArray {

    /**
     * Returns the number of even values in the array
     * @param array a 1-dimensional array
     * @return number of even values in array
     */
    static int even(int[] array) {

        int count = 0;

        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }





    /**
     * Returns the number of positive odd numbers in the array
     * @param array a 1-dimensional array
     * @return number of positive odd numbers
     */
    static int positiveOdd(int[] array) {

        int count = 0;
        for (int i = 0; i <= array.length; i++) {
            if (array[i] > 0 && array[i] % 2 != 0) {
                count++;
            }    
        }
        return count;
    }





    /**
     * Returns reversed array
     * @param array a 1-dimensional array
     * @return reversed array
     */
    static int[] reverse(int[] array) {

        int[] temp = new int[array.length];
        int j = 0;

        for (int i = array.length - 1; i >= 0; i--) {
            temp[j] = array[i];
            j++;
        }

        return temp;

    }





    /**
     * Returns true if both arrays are identical and false otherwise.
     * @param array1 a 1-dimensional array.
     * @param array2 a 1-dimensional array.
     * @return true if both arrays are identical and false otherwise.
     */
    static boolean compare(int [] array1, int[] array2) {

        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i <= array1.length - 1; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true;

    }





      /**
     * Returns numbers from the array1 that do not appear in array2.
     *
     * @param array1 a 1-dimensional array.
     * @param array2 a 1-dimensional array
     * @return The numbers from the first array that do not appear in the second array
     */
    static int[] different(int[] array1, int[] array2) {

        HashSet<Integer> unique_array2 = new HashSet<>(); // hashset of unique elements from array2
        ArrayList<Integer> resultList = new ArrayList<>(); // ArrayList of elements of array1 that do not appear in array2

      
        for (int num : array2) { // populate hashset with unique elements from array2
            unique_array2.add(num); 
        }


        for (int num : array1) { 
            if (!unique_array2.contains(num)) { // check if element from array1 is not present in array2
                resultList.add(num);
            }

            else {
                continue;
            }
        }

        int [] resultArray = new int[resultList.size()];

        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }




      /**
     * Returns true if number is present in the array or false otherwise.
     *
     * @param number number to find in the array.
     * @param array 1-dimensional array to find the number in.
     * @return the sum of values in the last column.
     */
    static boolean exist(int number, int[] array) {
        // returns true if number is present in the array
        // or false otherwise

        HashSet<Integer> numbers = new HashSet<Integer>();

        for (int i = 0; i <= array.length - 1; i++) {
            numbers.add(array[i]);
        }

        return numbers.contains(number);
    }



    /**
     * Returns the second largest number in the array
     *
     * @param array a 1-dimensional array
     * @return the second largest number in the array.
    */
    static int secondMax(int[] array) {
        Arrays.sort(array);
        return array[array.length-2];
    }




     /**
     * Returns the sum of numbers in the last column. 
     * It is assumed that every row has at least one element.
     *
     * @param array a two-dimensional array.
     * @return the sum of values in the last column.
     */
    static int lastColumn(int[][] array) {

        int sum = 0;

        for (int[] row : array) {
            sum = sum + row[row.length-1];
        }

        return sum;
    }




    /**
     * Swaps the last and first column in a 2D array.
     *
     * @param array a two-dimensional array.
     * @return a two-dimensional array with swapped columns
     */
    static int[][] swap(int[][] array) {

        int temp;

        for (int[] row : array) {

            // 1. Store first element of the row in the temp variable
            // 2. Assign the element at the last index to the first index
            // 3. Assign temp value to the last index of the row

            temp = row[0];
            row[0] = row[row.length-1];
            row[row.length-1] = temp;
        }

        return array;
    }




    /**
     * Converts a 2D array into a 1D array.
     *
     * @param array The two-dimensional array to convert.
     * @return A one-dimensional array containing all elements of the input array.
    */
    static int[] two2one(int[][] array) {

        ArrayList<Integer> resultList = new ArrayList<Integer>();

        for (int[] row : array) {

            for (int element : row){

                resultList.add(element);

            }
        }

        int[] resultArray = new int[resultList.size()];

        for (int i = 0; i < resultList.size(); i++) {

            resultArray[i] = resultList.get(i);

        }

        return resultArray;


    }
}
