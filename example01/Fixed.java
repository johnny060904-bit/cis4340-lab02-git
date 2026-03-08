import java.util.Scanner;

public class Fixed {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");

        if (input.hasNextInt()) {
            int age = input.nextInt();
            System.out.println("Your age is " + age);
        } else {
            System.out.println("Invalid input.");
        }

        input.close();
    }
}