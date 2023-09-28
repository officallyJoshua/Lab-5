import java.util.Scanner;
public class NumCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        if (scanner.hasNextDouble()) {
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            if (scanner.hasNextDouble()) {
                double num2 = scanner.nextDouble();

                if (num1 == num2) {
                    System.out.println("The numbers are equal.");
                } else if (num1 < num2) {
                    System.out.println("The first number is less than the second number.");
                } else {
                    System.out.println("The second number is less than the first number.");
                }
            } else {
                System.out.println("The second input is not a valid number. Please try again.");
            }
        } else {
            System.out.println("The first input is not a valid number. Please try again.");
        }

        scanner.close();
    }
}
