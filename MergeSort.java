import java.io.*;
import java.lang.System;

class MergeSort {
    public static void sort( int[] arr, int start, int end ) {
        // keep diving as long as there is more than 1 element in the array
        int mid = ( start + end ) / 2;
        
        if( start != end ) {
            sort(arr, start, mid);
            sort(arr, mid + 1, end);
        } else {
            // nothing to do
            return;
        }

        // merge the 2 parts of the array
        int i = start; // lowest in first part of array
        int j = mid + 1; // lowest in second part of array
        int[] temp = new int[ end - start + 1 ];
        int k = 0;

        // { 1, 5 }        { 8, 33 }
        while( i <= mid && j <= end ) {
            if( arr[i] < arr[j] ) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }

        // copy any remaining items
        if( i <= mid ) {
            for( int l = i; l <= mid; l++ ) {
                temp[k] = arr[l];
                k++;
            }
        }
        
        if( j <= end ) {
            for( int l = j; l <= end; l++ ) {
                temp[k] = arr[l];
                k++;
            }
        }

        // copy over temp to arr
        for( int m = start, n = 0; m <= end; m++, n++ ) {
            arr[m] = temp[n];
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 33, 8, 27, 2, 12, 6, 0, 15, 36, 29, 20, 11, 25, 13 };
        
        sort( arr, 0, arr.length - 1 );

        for( int i = 0; i < arr.length; i++ ) {
            System.out.print( arr[i] + ", " );
        }
    }
}