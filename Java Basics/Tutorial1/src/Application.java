public class Application {
    public static void main(String[] args) {
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


        //String is a class
        String text = "Hello";
        String blank = " ";
        String name = "Adam";
        String greeting = text + blank + name;
        System.out.println(greeting);
    }
}