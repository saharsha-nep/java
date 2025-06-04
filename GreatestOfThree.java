import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int A = input.nextInt();
        System.out.print("Enter second number: ");
        int B = input.nextInt();
        System.out.print("Enter third number: ");
        int C = input.nextInt();
        if(A>=B && A>=C){
            System.out.println(A + " is the greatest.");
        } else if(B>=A && B>=C){
            System.out.println(B + " is the greatest.");
        } else {
            System.out.println(C + " is the greatest.");
        }
    }
}
