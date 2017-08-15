//import statement
import java.util.Scanner;

public class FormLetterWriter {
    public static void main(String[] args) {
        String givenName;
        String familyName;

        //scanner checks keyboard input
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your last name: ");
        familyName = input.nextLine();
        displaySalutation(familyName);

        System.out.println("Please enter your first name: ");
        givenName = input.nextLine();
        displaySalutation(givenName, familyName);
    }

    public static void displaySalutation(String lastName){
        System.out.println("Dear Mr and Mrs: " + lastName);
    }

    public static void displaySalutation(String firstName, String lastName){
        System.out.println("Dear: " + firstName + " " + lastName);
    }
}
