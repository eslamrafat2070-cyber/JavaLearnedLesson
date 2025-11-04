package Chapter7_Array;

import java.util.Arrays;
import java.util.Random;

public class lotteryTiketExampleByEslam {

    private static final int RANGE = 40;
    private static final int LENTH = 6;
 public static   int[] generateLotteryTicket(){

        int[] ticket = new int[LENTH];
        Random random = new Random();
        for (int i =0 ; i < LENTH ; i++ )
        {
            ticket[i]=random.nextInt(1,RANGE);

        }
        return ticket;
 }

 public  static void  printLotteryTicket(int[] ticket){
     for (int i =0 ; i < LENTH ; i++ )
     {
         System.out.print(ticket[i] + " | ");

     }
 }

 public static void main(String[] args) {
       int[] randomArray;
     randomArray= generateLotteryTicket();
         printLotteryTicket(randomArray);

         Arrays.sort(randomArray);
     System.out.println("\nLottery Ticket after sorting:");
     printLotteryTicket(randomArray);

     int index =Arrays.binarySearch(randomArray,5);
     System.out.println("\n the index of 5 is "+ index);
 }
}
