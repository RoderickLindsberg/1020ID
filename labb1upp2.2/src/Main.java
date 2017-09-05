public class Main {
    public static void main(String[] args) {
//
//        //this is the first test
//        long startTime = System.currentTimeMillis();
//
//        RecursivePascal myRecursivePascal = new RecursivePascal();
//        myRecursivePascal.printPascal(10);
//        System.out.println();
//
//        long stopTime = System.currentTimeMillis();
//        System.out.println("The recursive program takes " + (stopTime - startTime) + " ms.\n");
//
//
//
//        //this is another test
//        startTime = System.currentTimeMillis();
//
//        IterativePascal myIterativePascal = new IterativePascal();
//        myIterativePascal.printPascal(10);
//        System.out.println();
//
//        stopTime = System.currentTimeMillis();
//        System.out.println("The iterative program takes " + (stopTime - startTime) + " ms.");

        RecursivePascal testPascal = new RecursivePascal();

        System.out.print(testPascal.printPascal(-10));
    }
}
