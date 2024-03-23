import java.util.Scanner;

public class Functions {
    // wip
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        greeting(scanner);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum(scanner, num1, num2));
        scanner.close();
    }

    static void greeting(Scanner scanner) {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }

    static int sum(Scanner scanner, int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
}
