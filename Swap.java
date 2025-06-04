import java.util.Scanner;

 public class Swap {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int FirstNum = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int SecondNum = input2.nextInt();
        System.out.println("Your numbers are: " + FirstNum + "," + SecondNum);
        int temp;
        temp = FirstNum;
        FirstNum = SecondNum;
        SecondNum = temp;
        System.out.println("Your numbers are: " + FirstNum + "," + SecondNum);

    }
}