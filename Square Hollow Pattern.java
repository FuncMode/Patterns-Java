        int row, col;
        int n = 6;
        for (row = 1; row <= n; row++) {
            for (col = 1; col <= n; col++) {
                if(row >= 2 && row <= 5 && col >= 2 && col <= 5) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }   
            System.out.println();
        }
