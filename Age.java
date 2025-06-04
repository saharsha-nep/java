import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int num = input.nextInt();
        if(num > 60){
            System.out.println("You're a senior.");
        } else if(num<=60 && num>=20){
            System.out.println("You're an adult.");
        } else if(num<20 && num>=13){
            System.out.println("You're a teen.");
        } else{
            System.out.println("You're a child.");
        }
    }
}
