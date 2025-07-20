import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int enteredNumber = scan.nextInt();

        if (enteredNumber % 2 == 0) {
            System.out.println("The entered number is even.");
        } else {
            System.out.println("The entered number is odd.");
        }
        scan.close();
    }
}
