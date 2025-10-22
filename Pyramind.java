
        int i, j, k; 
        for (i = 1; i <= 5; i++) { // 5 rows
            for (j = i; j < 5; j++) {   
                System.out.print(" "); // spaces
            }

            // cols "*"
            for (k = 1; k <= (2*i-1); k++) {
                System.out.print("*");
            }

            System.out.println(); // printNextLine
        }
