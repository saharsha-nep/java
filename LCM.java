import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int first = input.nextInt();
        System.out.print("Enter a number: ");
        int second = input.nextInt();
        int result = LCM(first,second);
        System.out.println("LCM is: " + result);
    }
    public static int LCM(int first, int second){
        int i = 1;
        while (i<= second){
            int factor = first * i;
            if (factor % second == 0 ){
                return factor;
            }
            i++;
        }
        return 0;
    }
}
