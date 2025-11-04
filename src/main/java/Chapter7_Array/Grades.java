package Chapter7_Array;

import java.util.Scanner;

public class Grades {

    public  int getAverage(int[] grades)
    {
        int sum =0;
        for (int i=0 ; i<grades.length ; i++)
        {
            sum = sum + grades[i];
        }
        return  sum/ grades.length ;
    }

    public int getMax(int[] grades)
    {
        int max=grades[0];
        for (int i=1 ; i<grades.length ; i++)
        {
            if (grades[i]>max)
            {
                max=grades[i];
            }
        }
        return max;
    }
    public  int getLow(int[] grades)
    {
        int min=grades[0];
        for (int i=1 ; i<grades.length ; i++)
        {
            if (grades[i]<min)
            {
                min=grades[i];
            }
        }
        return min;
    }

    public int[] readGrades(int[] array , Scanner scanner) {

        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter grade " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static   void main(String[] args) {
        Grades gradesObj = new Grades();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of grades: ");
        int numberOfGrades = scanner.nextInt();
        int[] grades = new int[numberOfGrades];
        grades = gradesObj.readGrades(grades, scanner);
        scanner.close();
        System.out.println("Average Grade: " + gradesObj.getAverage(grades));
        System.out.println("Maximum Grade: " + gradesObj.getMax(grades));
        System.out.println("Minimum Grade: " + gradesObj.getLow(grades));
    }

}
