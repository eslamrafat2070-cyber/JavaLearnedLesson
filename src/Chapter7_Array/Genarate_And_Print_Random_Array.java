package Chapter7_Array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Genarate_And_Print_Random_Array
{

     public int[]  GenRandomArray(int lengh)
    {
        Random  R = new Random();
        int[] randomarray = new int[lengh];
        for (int i =0 ; i < lengh ; i++ )
        {
            randomarray[i]=R.nextInt(40);

        }
            return randomarray;
    }

    public  void  printarray(int[] i)
{
    System.out.println("the array is "+ Arrays.toString(i));
}

    public  static  void  main()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Plesae enter the lengh of the array  " );
         int lenth = scan.nextInt();

         int[] teamparray= new int[lenth];
         Genarate_And_Print_Random_Array array = new Genarate_And_Print_Random_Array();
         teamparray=array.GenRandomArray(lenth);
         array.printarray(teamparray);

    }
}
