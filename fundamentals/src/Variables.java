public class Variables {
    // Static variable declared outside any method with the 'static' keyword
    static int count = 0;

    // Instance Variable declared outside any method
    String color;
    public static void main(String[] args) {
        // example for local variable
        Variables example = new Variables();
        example.myMethod();

        //  examples for instance variable
        Variables example2 = new Variables();
        Variables example3 = new Variables();
        example2.color = "blue";
        example3.color = "red";

        System.out.println(example2.color);
        System.out.println(example3.color);

        // example for static variable
        System.out.println(Variables.count);
    }   

    public void myMethod() {
        // Local Variable
        int localVariable = 10; // declaring  a local variable inside the method
        System.out.println("Local variable value: " + localVariable);
    }
}


