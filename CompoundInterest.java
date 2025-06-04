import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principal: ");
        double P = input.nextDouble();
        System.out.print("Enter rate: ");
        int R = input.nextInt();
        System.out.print("Enter time: ");
        float T = input.nextFloat();
        System.out.println("The compound interest is: " + (P*T*(1+(R/100))));
    }
}
