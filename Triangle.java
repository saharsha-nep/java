import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        int B = input.nextInt();
        System.out.print("Enter the height of the triangle :");
        int H = input.nextInt();
        System.out.println("The area of the triangle is: " + (0.5*B*H));
    }
}
