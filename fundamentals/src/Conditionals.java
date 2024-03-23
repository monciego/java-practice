public class Conditionals {
 public static void main(String[] args) {
        // if else, else if
        int salary = 25400;

        if (salary > 10000) {
            salary = salary + 2000;
        } else if (salary > 20000)  {
            salary += 3000;
        } else {
            salary = salary + 1000;
        }

        System.out.println(salary);

        // Ternary Operator
        int number = 13;
        String output = (number % 2 == 0 ) ? "even number" : "odd number";
        System.out.println(output);

        // nested if statement
        int age = 20;
        int weight = 80;

        if (age >= 18) {
            if (weight > 50) {
                System.out.println("You are eligible to donate blood.");
            } else {
                System.out.println("You are not eligible to donate blood.");
            }
        } else {
            System.out.println("Age must be greater than 18");
        }
    }   
}
