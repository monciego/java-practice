import java.util.Scanner;

public class Animal {
    public static String iAmDog() {
        return "I am a dawg!";
    }

    public static String bark() {
        return "bark! bark! bark";
    }

    public static String guardDog() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        scanner.close();

        String message;

        if(age >= 18 && age < 50) {
            message = "You're a dawg! You can come in!";
        } else if (age >= 50) {
            message = "Dawg! You're an OG! ARF ARF ARF!";
        } else {
            message = "Dawg! You're too young, you can't come in!" + bark();
        }

        return message;
    }

    public static void fiftyDogs() {
        int num = 5;
        
        while(num <= 50 ) {
            System.out.println(num + " Dog");
            num++;
        }
    }

    public static void animals() {
        String[] arrayAnimals = {"Dog", "Cat", "Lion", "Elephant", "Tiger", "Bear", "Giraffe", "Monkey", "Zebra", "Kangaroo"};

        for (String a: arrayAnimals) {
            System.out.println(a);
        }
    }

    public static void atleastITried() {
        try {
            int[] evenNumbers = {2, 4, 6, 8, 10};
            System.out.println(evenNumbers[5]);
        } catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        }
    }
}
