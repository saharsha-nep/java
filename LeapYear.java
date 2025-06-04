import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int num = input.nextInt();
        if(num%4==0 && num%100!=0 || num%4==0 && num%100==0 && num%400==0){
            System.out.println("It is a leap year.");
        } else {
            System.out.println("It is not a leap year.");
        }
    }
}
