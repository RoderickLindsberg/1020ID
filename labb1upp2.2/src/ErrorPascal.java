public abstract class ErrorPascal implements Pascal{

    //returns false when error
    public int evilChecker (int n, int k){
        if (k < 0 | k > n) {
            return -1;
        } else if (n > 1000 | k > 1000) {
            System.out.println("Don't be too evil and ambitious, please try a smaller number.");
            return -1;
        } else {
            return 0;
        }
    }
}