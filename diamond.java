    int i, j, k;
    int n = 5; 
    // upper half pyramid
    for (i = 1; i <= n; i++) {
        // spaces
        for (j = i; j < n; j++) {
            System.out.print(" ");
        }
        // stars
        for (k = 1; k <= (2*i-1); k++) {
            System.out.print("*");
        }
        System.out.println();
    }

    // lower half pyramid
    for (i = n-1; i >= 1; i--) {
        // spaces
        for (j = i; j < n; j++) {
            System.out.print(" ");
        }
        // stars
        for (k = 1; k <= (2*i-1); k++) {
            System.out.print("*");
        }
        System.out.println();
    }
