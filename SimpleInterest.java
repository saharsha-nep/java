import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principal: ");
        double P = input.nextDouble();
        System.out.print("Enter rate: ");
        int R = input.nextInt();
        System.out.print("Enter time: ");
        float T = input.nextFloat();
        System.out.println("The simple interest is: " + ((P*T*R)/100));
    }
}
