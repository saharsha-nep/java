import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int size = input.nextInt();
        int [] num = new int[size];
        int  i = 0;
        while(i<size){
            System.out.print("please enter the element: ");
            num[i] = input.nextInt();
            i++;
        }
        return num;
    }
}
