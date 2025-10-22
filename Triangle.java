
        int rows, cols;
        int n = 5;

        for (rows = 1; rows <= n; rows++) {
            for (cols = 1; cols <= rows; cols++) {
                // the cols depends on the rows 
                // if cols 1 <= rows 1
                // print * then update the cols so 2
                // then check if 2 <= rows 1 so false exitt the inner loop and back to outer and update the rows so 2
                // check if rows 2 is <= n which is 5 so true then printLn 
                // execute the inner loop again and check if cols 1 is <= 2 so true
                // and print * so in this happen the cols initialization is reset when cols and rows condtion in outer is false
                // mag uupdate lang ito kung mas mataas ang rows kesa sa cols
                System.out.print("* ");
            }   
            System.out.println();
        }
