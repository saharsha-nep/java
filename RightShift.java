import java.util.Scanner;

public class RightShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        int answer = num1 >> 1;
        System.out.println("Right shift gives: " + answer);
    }
}
