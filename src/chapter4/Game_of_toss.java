package chapter4;

import java.util.Random;

public class Game_of_toss {

    public static void main(String[] args)
    {

        Random random = new Random();
        int maxumnumber=5;
         // declare the maximum number
         int currentaccumilator=0;
         int  maximumaccumilator=20;
         int total =0;

        for(int i=0; i<maxumnumber;i++)
        {

            int die = random.nextInt(6) + 1;
            total=die+total;
            currentaccumilator=maximumaccumilator-die;
            if(currentaccumilator <0)
            {
                System.out.println("YourToss is   " +die+ "  for the "+(i+1) +"Time"+"the remaining is "+0);
                break;
            }
            System.out.println("You Toss is   " +die+ "  for the "+(i+1) +"Time"+"the remaining is "+currentaccumilator);

            maximumaccumilator=maximumaccumilator-die;
        }

        if (total>=20)
        {
            System.out.println("You are winned");
        }
        else {
            System.out.println("You are lossed ");
        }
        }
    }

