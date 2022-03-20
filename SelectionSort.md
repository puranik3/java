# Selection sort
n = 1000
Running time: n^2 -> 1000 * 1000 = 1000000
arr = { 1, 5, 33, 8, 27, 2, 12, 6, 0, 15 }

for( int j = arr.length - 1; j >= 1; j-- ) { // outer loop
    max_i = 0;
    max = arr[0];

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

// After Iteration 1 of outer loop (j = arr.length - 1)
arr = { 1, 5, 15, 8, 27, 2, 12, 6, 0, 33 }

// After Iteration 1 of outer loop (j = arr.length - 2)
max = 27, max_i = 4
arr = { 1, 5, 15, 8, 0, 2, 12, 6, 27, 33 }