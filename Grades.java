import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your percentage in number: ");
        int percentage = input.nextInt();
        if(percentage>90){
            System.out.println("Your grade is: A");
        } else if(percentage<=90 && percentage>75){
            System.out.println("Your grade is: B");
        } else if(percentage<=75 && percentage>60){
            System.out.println("Your grade is: C");
        } else if(percentage<=60 && percentage>30){
            System.out.println("Your grade is: D");
        } else {
            System.out.println("Your grade is: F");
        }
    }
}
