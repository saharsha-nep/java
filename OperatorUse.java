import java.util.Scanner;

public class OperatorUse {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter your second number: ");
        int num2 = input2.nextInt();
        int sum = num1 + num2;
        int diff = num1 - num2;
        int product = num1 * num2;
        int div = num1 / num2;
        int remainder = num1 % num2;
        System.out.print("\n Sum: " + sum + "\n Difference: " + diff + "\n Product: " + product + "\n Divison: " + div + "\n remainder: " + remainder);
    }
}
