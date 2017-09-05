public class IterativePascal implements Pascal{
    boolean isIncrementing = false;


    public int factorial (int n) {
        int product = 1;
        for ( int i = 1; i <= n; i++ ) {
            product *= i;
        }
        return product;
    }

    public int binom(int n, int k) {
        int namnare = 1;
        int taljare = 1;

        if (k == 0 | k == n) {
            return 1;
        } else if (k == 1 | n - k == 1) {
            return n;
        }

        taljare = factorial(n);
        namnare = factorial(k) * (factorial(n - k));
        return taljare/namnare;

    }

    public void printPascal(int n) {

        if (isIncrementing) {
            for (int i = 0; i <= n; i++) {
                for (int k = 0; k <= i; k++) {
                    System.out.print(binom(i, k) + "\t");
                }
                System.out.println();
            }
        }
        // when isIncrementing is false
        else {
            for (int i = n; i >= 0; i--) {
                for (int k = 0; k <= i; k++) {
                    System.out.print(binom(i, k) + "\t");
                }
                System.out.println();
            }
        }
    }
}