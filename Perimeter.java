import java.util.Scanner;

public class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first side: ");
        int A = input.nextInt();
        System.out.print("Enter the second side: ");
        int B = input.nextInt();
        System.out.print("Enter the third side: ");
        int C = input.nextInt();
        System.out.print("enter the fourth side: ");
        int D = input.nextInt();
        int perimeter = A + B + C + D;
        System.out.print("Perimeter: " + perimeter);
    }
}
