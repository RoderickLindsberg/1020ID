public class RecursivePascal {
    //this variable indicates the line number. It starts at line 0 and prints 1, ... line 3 and prints 1 2 1 etc.
    public int whichLine = 0;
    //when false, prints out the triangle upside down.
    boolean isIncrementing = true;


    int[][] myArrayCache = new int[40][40];
//    RecursivePascal(int n) {
//        int[][] myArrayCache = new int[n][n];
//    }

    //this method calculate which number to be print out, when provided "coordinates" n and k
    public int binom(int n, int k) {
        if (k == 0 | k == n) {
            return 1;
        } else if (k == 1 | n - k == 1) {
            return n;
        }

        if (myArrayCache[n][k] != 0){
            return myArrayCache[n][k];
        } else {
            myArrayCache[n][k] = binom(n - 1, k - 1) + binom(n - 1, k);
            return myArrayCache[n][k];
        }
    }



    //this method prints out a Pascal triangle in a slower way
    public void printPascal(int n) {

        if (isIncrementing) {
            if (n == whichLine) {
                //Prints out all numbers in a line (example 1 2 1 when whichLine == 2)
                for (int k = 0; k < n + 1; k++) {
                    System.out.print(binom(n, k) + "\t");
                }
                System.out.println();
                whichLine++;

                //if not, call binom and store the return value in the array

            } else{
                printPascal(n - 1);
                printPascal(n);
            }

        } else
            //(else if) runs when isIncrementing is false
            if (n >= 0) {
                for (int k = 0; k < n + 1; k++) {
                    System.out.print(binom(n, k) + "\t");
                }
                System.out.println();
                printPascal(n - 1);
            }
    }





    public static int binomSlowly(int n, int k) {
        if (k == 0 | k == n) {
            return 1;
        } else if (k == 1 | n - k == 1) {
            return n;
        } else {
            return binomSlowly(n - 1, k - 1) + binomSlowly(n - 1, k);
        }
    }

    public void printPascalSlowly(int n) {
        if (n >= 0) {
            for (int k = 0; k < n + 1; k++) {
                System.out.print(binomSlowly(n, k) + "\t");
            }
            System.out.println();
            printPascalSlowly(n - 1);
        }
    }
}
