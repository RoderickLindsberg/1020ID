public class Main {
    public static void main(String[] args) {

        //this is the first test
        long startTime = System.currentTimeMillis();

        RecursivePascal testPascal = new RecursivePascal();
        testPascal.printPascal(39);
        System.out.println();


        long stopTime = System.currentTimeMillis();
        System.out.println("The cache-enabled program takes " + (stopTime - startTime) + " ms.\n");



        //this is another test
        startTime = System.currentTimeMillis();


        testPascal.printPascalSlowly(29);
        System.out.println();


        stopTime = System.currentTimeMillis();
        System.out.println("The no-cache program takes " + (stopTime - startTime) + " ms.");

    }
}