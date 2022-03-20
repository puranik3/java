import java.io.*;
import java.lang.System;

class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 33, 8, 27, 2, 12, 6, 0, 15 };
        int max, max_i;

        // put the highest number in the remaining part of the array at the end in each iteration of the outer loop
        for( int j = arr.length - 1; j >= 1; j-- ) { // outer loop
            // start by assumin the first item is the maximum
            max_i = 0;
            max = arr[0];

            // get the maximum in the remaining part of the array
            for( int i = 0; i <= j; i++ ) { // inner loop
                if( arr[i] > max ) {
                    max = arr[i];
                    max_i = i; // index of max item
                }
            }

            // swap the max with the last item in the array
            arr[max_i] = arr[j];
            arr[j] = max;
        }

        for( int i = 0; i < arr.length; i++ ) {
            System.out.print( arr[i] + ", " );
        }
    }
}