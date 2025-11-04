package Chapter7_Array;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Random;

public class LottaryExampleAfterFinishTheSession {
    private final int LENTH=6;
    private final int Boundary=10;
    Random random = new Random();
    int[] array = new int[LENTH];



    public int[] generateLottaryArray() {
        // Implementation for generating lottery numbers
       for (int i = 0; i < LENTH; i++) {
              int newnumber;
           do {
               newnumber = random.nextInt(Boundary) + 1;
           } while (isNumberInArray(newnumber,Arrays.copyOf(array,i)));

           array[i]= newnumber;
       }
       return array;
    }

    /**
     * @method is to print the lottary numbers
     * @param array is the array to print
     */
    public void printLottaryArray(int[] array) {
        // Implementation for printing lottery numbers
        for (int i = 0; i < LENTH; i++) {
            System.out.print(array[i] + " | ");
        }
    }
    // using bimarry search to check if the number is in the array
  public   boolean isNumberInArray(int number , int[] array)
  {
         Arrays.sort(array);
        int index = Arrays.binarySearch(array, number);
        if (index >= 0) {
            return true; // number found
        } else {
            return false; // number not found
        }
  }

    @Test
    public void testLottaryExample() {
        LottaryExampleAfterFinishTheSession lottary = new LottaryExampleAfterFinishTheSession();
        int[] lottaryNumbers = lottary.generateLottaryArray();
        lottary.printLottaryArray(lottaryNumbers);
    }
}
