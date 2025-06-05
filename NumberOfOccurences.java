import java.util.Scanner;

public class NumberOfOccurences {
    public static void main(String[] args) {
        int[] numArray = ArrayUtility.inputArray();
        int number = Number(numArray);
        System.out.println("Number of times element was found was: " + number);
    }
    public static int Number(int[] numArray){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number you'd like to search for: ");
        int num = input.nextInt();
        int i = 0;
        int count = 0;
        while(i<numArray.length){
            if(numArray[i] == num){
                count +=1;
                i++;
            }else{
                i++;
            }

        }
        return count;
    }
}
