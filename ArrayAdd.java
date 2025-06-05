import java.util.Scanner;

public class ArrayAdd{
    public static void main(String[] args) {
        int[] numArray = ArrayUtility.inputArray();
        long sum = sum(numArray);
        double avg = average(numArray);
        System.out.println("Sum is: " + sum);
        System.out.println("Average is: " + avg);
    }
    public static long sum(int[] numArray){
        int i = 0;
        long sum = 0;
        while(i < numArray.length){
            sum += numArray[i];
            i++;
        }
        return sum;
    }
    public static double average(int[] numArray){
        double sum = sum(numArray);
        return (sum/numArray.length) ;
    }
}