import java.util.Scanner;

public class Bang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;

        System.out.println("Type in a number (do not bang on the keyboard): ");
        num1 = sc.nextInt();

        num1 = (2 * (num1 + 5)) - 7;

        System.out.print("Your new number is " + num1);
    }
}
