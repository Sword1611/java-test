import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inputNumber;
        String answer;

        do {
            System.out.print("Enter a number: ");
            if (scan.hasNextInt()) {
                inputNumber = scan.nextInt();
                if (inputNumber % 2 == 0) {
                    System.out.println("The number entered is even.");
                } else {
                    System.out.println("The number entered is odd.");
                }
            } else {
                System.out.println("ERROR! The input is not an integer!");
                scan.next();
            }
            System.out.println("Do you want to continue? Yes or No?");
            answer = scan.next();
        } while (answer.equalsIgnoreCase("y"));

        scan.close();
    }
}
