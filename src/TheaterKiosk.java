import java.util.Scanner;
public class TheaterKiosk
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your age : ");
        int age = scanner.nextInt();

        if (age >= 21) {
            System.out.println("You get a wrist band.");
        }
        scanner.close();
    }
}
