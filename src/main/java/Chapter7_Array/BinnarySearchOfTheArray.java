package Chapter7_Array;

import java.util.Arrays;
import java.util.Random;

public class BinnarySearchOfTheArray {

    public int[] GererateRandonArray(int lenght){


        Random random = new Random();
        int[] array = new int[lenght];
        for (int i =0 ; i< lenght ; i++){
            array[i]= random.nextInt(13);
        }
        return array;
    }
    public  void printarray(int[] i){
        System.out.println("the array is "+ java.util.Arrays.toString(i));}

    /**
     *
     * @param numberToSearch
     * @param array
     * @return void
     * @description This method searches for a number in an array using binary search algorithm.
     */
    public void SearchInArrayBinnary(int[] array , int numberToSearch){
        {
              Arrays.sort(array);
              printarray(array);
              int index=Arrays.binarySearch(array ,numberToSearch);
              if ( index >=0)
                  System.out.println("the number "+ numberToSearch +" is found in the array "
                          + " at index " + index);
              else
                  System.out.println("the number "+ numberToSearch +" is not found in the array ");
        }
    }

    public static void  main(String[] args) {
        BinnarySearchOfTheArray array = new BinnarySearchOfTheArray();
        int[] randomarray = array.GererateRandonArray(10);
        array.SearchInArrayBinnary( randomarray , 9);
    }
}
