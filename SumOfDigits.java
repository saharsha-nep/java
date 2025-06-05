import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int sum = Calculate(num);
        System.out.println("Sum of digits is: " + sum);
    }

    public static int Calculate(int num) {
        int total = 0;
        while(num!=0){
            int digit = num%10;
            total += digit;
            num /= 10;
        }
        return total;
    }
}
