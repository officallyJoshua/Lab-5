import java.util.Scanner;
public class PartyAffliation
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your party affliation D for democrat, R for republican and I for Independent  : ");
        String choice = scanner.next();

        switch (choice) {
            case "D":
                System.out.println("You get a Democratic Monkey.");
                break;
            case "R":
                System.out.println("You get a Republican Elephant.");
                break;
            case "I":
                System.out.println("You get an Independent Person");
                break;
            default:
                System.out.println("You get Other");
        }
        scanner.close();
    }
}
