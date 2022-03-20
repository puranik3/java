class MergeSort {
    static sort( arr, start, end ) {
        // keep diving as long as there is more than 1 element in the array
        let mid = Math.floor(( start + end ) / 2);
        
        if( start != end ) {
            MergeSort.sort(arr, start, mid);
            MergeSort.sort(arr, mid + 1, end);
        } else {
            // nothing to do
            return;
        }

        // merge the 2 parts of the array
        let i = start; // lowest in first part of array
        let j = mid + 1; // lowest in second part of array
        let temp = new Array( end - start + 1 );
        let k = 0;

        // { 1, 5 }        { 8, 33 }
        if( i <= mid && j <= end ) {
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
            for( let l = i; l <= mid; l++ ) {
                temp[k] = arr[l];
                k++;
            }
        }
        
        if( j <= end ) {
            for( let l = j; l <= end; l++ ) {
                temp[k] = arr[l];
                k++;
            }
        }

        // copy over temp to arr
        for( let m = start, n = 0; m <= end; m++, n++ ) {
            arr[m] = temp[n];
        }
    }

    static main() {
        let arr = [ 1, 5, 33, 8, 27, 2, 12, 6, 0, 15, 36, 29, 20, 11, 25, 13 ];
        
        MergeSort.sort( arr, 0, arr.length - 1 );

        console.log( arr );
    }
}

MergeSort.main();