import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in fahrenheit: ");
        double F = input.nextDouble();
        double celcius = (F-32) * 5 / 9;
        System.out.println("The temperature in celcius is: " + celcius + "C");
    }
}
