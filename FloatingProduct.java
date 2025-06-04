import java.util.Scanner;

public class FloatingProduct {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter your first float number: ");
        float num1 = input1.nextFloat();
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter your first float number: ");
        float num2 = input2.nextFloat();
        float product = num1 * num2;
        System.out.println("Product: " + product);
    }
}
