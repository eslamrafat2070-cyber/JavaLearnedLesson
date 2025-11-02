package Chapter7_Array;

import java.util.Arrays;
import java.util.Random;

public class LoteryTicket {

    private  final  int LENGTH =6;
    private  final  int MAX_TIKET_NUMBER =69;

     public int[] generateArrayOfRandomNumbers()
     {
         int[] array1 = new int[LENGTH];
         Random random = new Random();

         for (int i = 0; i< LENGTH; i++)
         {
             int randomNumber;
             // generate unique random number
             do {
                    randomNumber = random.nextInt( MAX_TIKET_NUMBER )+ 1;
             }while (sequentialsearch(randomNumber , array1));

             array1[i] = randomNumber;
         }

         return array1;
     }

    public  void printTicket(int ticket[]){
        for(int i = 0; i< LENGTH; i++){
            System.out.print(ticket[i] + " | ");
        }
    }

    public  boolean sequentialsearch(int number , int[] array) {
         /* this enhanced loop
        it inert rates  over the  Array
        Each time assigns current element to value
          */
        for (int value : array) {
            if (value == number) {
                // value is eist in the array
                return true;
            }
        }
        // value is not eist in the arrayr
        return false;
    }

    public  boolean binarySearch(int number , int[] array) {
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, number);
        if (index >= 0) {
            return true; // number found
        } else {
            return false; // number not found
        }
    }

    public  static void main(String[] args){
        LoteryTicket loteryTicket = new LoteryTicket();
        int[] ticket = loteryTicket.generateArrayOfRandomNumbers();
        System.out.println("Uniq is  Ticket:");
        loteryTicket.printTicket(ticket);
        // to make an new line
        System.out.println();
        System.out.println("Soreted Lottery Ticket:");
        Arrays.sort(ticket);
        loteryTicket.printTicket(ticket);
    }
}

