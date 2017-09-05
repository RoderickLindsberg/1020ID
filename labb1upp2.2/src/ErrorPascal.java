public abstract class ErrorPascal implements Pascal{
    public boolean evilChecker (int n, int k){
        if (k < 0 | k > n) {
            return false;
        } else if (n > 1000 | k > 1000) {
            System.out.println("Don't be too evil and ambitious, please try a smaller number.");
            return false;
        } else {
            return true;
        }
    }
}