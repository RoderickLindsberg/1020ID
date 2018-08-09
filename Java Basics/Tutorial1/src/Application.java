public class Application {
    public static void main(String[] args) {

        System.out.println("Primitive types");
        //primitive types in Java
        //int   32-bit-number
        int number = 10;
        //short 16
        short myShort = 847;
        //long  64
        long myLong = 9797;
        //double
        double myDouble = 7.4232;
        //float
        float myFloat = 3.233f;
        //char
        char myChar = 'y';
        //boolean
        boolean myBoolean = false;
        //byte
        byte myByte = 127;

        System.out.println(number);
        System.out.println(myShort);
        System.out.println(myLong);
        System.out.println(myDouble);
        System.out.println(myFloat);
        System.out.println(myChar);
        System.out.println(myBoolean);
        System.out.println(myByte);



        System.out.println("\n");
        System.out.println("String type");
        //String is a class
        String text = "Hello";
        String blank = " ";
        String name = "Adam";
        String greeting = text + blank + name;
        System.out.println(greeting);



        System.out.println("\n");
        System.out.println("Playing with while-loops");
        boolean statement = 6 > 3;
        if (statement) {
            System.out.println("6 > 3 is " + statement);
        }

        int i = 0;
        while (i < 10) {
            System.out.println("The value of i is " + i);
            i ++;
        }

        int whileLoopI = 0;
        while (whileLoopI < 5) {
            System.out.println("Looping: " + whileLoopI);
            if (whileLoopI == 5) break;
            whileLoopI ++;
        }



        System.out.println("\nFor-loops");
        for (int j = 0; j < 5; j++) {
            //%d means int
            System.out.printf("for-loop no. %d \n", j);
        }



        System.out.println("\nIf-statement");
        boolean cond = 4 == 3;
        //check if 4 is equal to 3
        System.out.println(cond);
    }
}