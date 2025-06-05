public class MaxMin {
    public static void main(String[] args) {
        int[] numArray = ArrayUtility.inputArray();
        int max = Maximum(numArray);
        int min = Minimum(numArray);
        System.out.println("Max element is: " + max +"\n"+ "Minimum element is: " + min);
    }
    public static int Maximum(int[] numArray){
        int i = numArray.length -1;
        return (numArray[i]);
    }
    public static int Minimum(int[] numArray){
        return (numArray[0]);
    }
}
