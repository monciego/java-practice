public class DataTypes {
    public static void main(String[] args) {
        /* Primitive Data Type */

        //  Integer Data Type
        byte myByte = 100; // (1 byte)
        short myShort = 500; // (2 bytes)
        int myInt = 1000; // (4 bytes)
        long  myLong = 10000000000L; // (8 bytes)
        // Floating Data Type
        float myFloat = 10.5f;// (4 bytes)
        double myDouble = 20.5;// (8 bytes)
        // Textual Data Type
        char myChar = 'a';// (2 bytes)
        // Logical 
        boolean myBoolean = true; // true/false (1 byte)

        System.out.println("Byte: " + myByte);
        System.out.println("Short: " + myShort);
        System.out.println("Int: " + myInt);
        System.out.println("Long: " + myLong);
        System.out.println("Float: " + myFloat);
        System.out.println("Double: " + myDouble);
        System.out.println("Char: " + myChar);
        System.out.println("Boolean: " + myBoolean);

        /* Type conversion  */
        int numInt = 10;
        double numDouble = numInt; // Implicit conversion from int to double
        System.out.println("Double value: " + numDouble);

        /* Type Casting */
        double numDouble2 = 10.5;
        int numInt2 = (int) numDouble2; // Explicitly casting double to int
        System.out.println("Int value: " + numInt2);
    }
}
