import java.util.Scanner;

public class SumOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        int i = 1;
        int sum = 0;
        while(i<=num){
            sum = sum + i;
            i +=2;
        }
        System.out.println("Sum of odd numbers is : " + sum);
    }
}
