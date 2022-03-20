import java.io.*;
import java.lang.System;

public class LinearSearch {
    private static int search( int[] arr, int key ) {
        for( int i = 0; i < arr.length; i++ ) {
            if( arr[i] == key ) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 33, 8, 27, 2, 12, 6, 0, 15, 36, 29, 20, 11, 25, 13 };
        
        int pos = search( arr, 70 );

        System.out.println( pos );
    }
}
