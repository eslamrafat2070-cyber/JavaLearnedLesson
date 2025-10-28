package Chapter7_Array;

import java.util.Random;

public class LoteryTicket {

    private static final  int  length=6;
    private static final  int  Maxtiketnumber=69;

     public  static   int[] GenerateNumber()
     {
         int[] array1 = new int[length];
         Random random = new Random();

         for (int i =0; i< length ; i++)
         {
             array1[i]=random.nextInt(Maxtiketnumber);
         }

         return array1;
     }

    public static void printTicket(int ticket[]){
        for(int i=0; i<length; i++){
            System.out.print(ticket[i] + " | ");
        }
    }

    public  static   void main(String[] args) {
      int [] Tiket = LoteryTicket.GenerateNumber();
      LoteryTicket.printTicket(Tiket);
    }

}
