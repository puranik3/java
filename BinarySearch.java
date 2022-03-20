import java.io.*;
import java.lang.System;

public class BinarySearch {
    private static int search( int[] arr, int key ) {
        int low = 0;
        int high = arr.length;

        do {
            int mid = ( low + high ) / 2;

            // check if arr[mid] is what you are searching for
            if( arr[mid] == key ) {
                return mid; // we found the key at position mid
            }

            if( arr[mid] < key ) { // then key can only be in right side of mid
                low = mid + 1;
            } else { // key can only be in left side of mid
                high = mid - 1;
            }
        } while( low <= high );

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 5, 6, 8, 11, 12, 13, 20, 25, 27, 29, 33, 36, 38 };
        
        int pos = search( arr, 6 ); // it is working!

        System.out.println( pos );
    }
}
