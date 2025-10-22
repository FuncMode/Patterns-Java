        int rows, cols;
        int n = 5;

        for (rows = n; rows >= 1; rows--) {
            for (cols = 1; cols <= rows; cols++) {
                System.out.print("* ");
            }
            System.out.println();
        }
