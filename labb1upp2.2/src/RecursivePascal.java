public class RecursivePascal extends ErrorPascal{

    //this variable indicates the line number. It starts at line 0 and prints 1, ... line 3 and prints 1 2 1 etc.
    public int whichLine = 0;
    //when false, prints out the triangle upside down.
    boolean isIncrementing = true;
    //create a array-cache
    int[][] myArrayCache = new int[100][100];
    int errorCode = 0;


//    RecursivePascal(int n) {
//        int[][] myArrayCache = new int[n][n];
//    }

    //this method calculate which number to be print out, when provided "coordinates" n and k
    public int binom(int n, int k) {

        //check n and k for errors
        if(evilChecker(n, k) == -1){
            //error, code -1
            errorCode = -1;
            return errorCode;
        }
        //no error, continues
        if (k == 0 | k == n) {
            return 1;
        } else if (k == 1 | n - k == 1) {
            return n;
        }
        //cache hit
        if (myArrayCache[n][k] != 0){
            return myArrayCache[n][k];
        } else {
            //cache miss
            myArrayCache[n][k] = binom(n - 1, k - 1) + binom(n - 1, k);
            return myArrayCache[n][k];
        }
    }



    //this method prints out a Pascal triangle in a slower way
    public int printPascal(int n) {

        //invalid n, error -1
        if(evilChecker(n, n) == -1){
            //error, code -1
            errorCode = -1;
            System.out.println("Error: ");
            return -1;
        }
        //no error, continues
        if (isIncrementing) {
            if (n == whichLine) {
                //Prints out all numbers in a line (example 1 2 1 when whichLine == 2)
                for (int k = 0; k < n + 1; k++) {
                    //the triangle is symmetric
                    if (k > n/2) {
                        System.out.print(binom(n, n - k) + "\t");
                    } else {

                        System.out.print(binom(n, n - k) + "\t");
                    }

                }
                System.out.println();
                whichLine++;

            } else {
                //goes recursively all the way to the first line n = 0
                printPascal(n - 1);
                //then print rows down to n
                printPascal(n);
            }

        } else
            //(else if) runs when isIncrementing is false
            if (n >= 0) {
                for (int k = 0; k < n + 1; k++) {
                    //the triangle is symmetric
                    if (k > n/2) {
                        System.out.print(binom(n, k - n/2) + "\t");
                    } else {
                        System.out.print(binom(n, k) + "\t");
                    }
                }
                System.out.println();
                //goes recursively to the bottom row
                printPascal(n - 1);
            }
        return 0;
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
