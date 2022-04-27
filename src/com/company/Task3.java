package com.company;

public class Task3
{
    public static void main(String[] args)
    {
        int array[] = new int[5];
        int array2[] = new int[5];
        int array3[] = new int[5];
        int sumArray = 0;
        int sumArray2 = 0;
        int sumArray3 = 0;
        System.out.print("Масив 1 - ");
        for(int i = 0; i<=4; i++)
        {
            array[i] = (int)(Math.random() * 5);
            System.out.print(array[i]+" ");
            sumArray +=array[i];
        }
        System.out.println();
        System.out.println("Середнє арифметичне Масиву 1 - " + sumArray/5);
        System.out.print("Масив 2 - ");
        for(int j = 0; j<=4; j++)
        {
            array2[j] = (int)(Math.random() * 5);
            System.out.print(array2[j]+" ");
            sumArray2 +=array[j];
        }
        System.out.println();
        System.out.println("Середнє арифметичне Масиву 2 - " + sumArray2/5);
        System.out.print("Масив 3 - ");
        for(int k = 0; k<=4; k++)
        {
            array3[k] = (int)(Math.random() * 5);
            System.out.print(array3[k]+" ");
            sumArray3 +=array[k];
        }
        System.out.println();
        System.out.println("Середнє арифметичне Масиву 3 - " + sumArray3/5);
        if (sumArray>sumArray2 && sumArray>sumArray3)
        {
            System.out.println("Середнє значення Масиву 1 є найбільшим");
        }
        else if (sumArray2>sumArray && sumArray2>sumArray3)
        {
            System.out.println("Середнє значення Масиву 2 є найбільшим");
        }
        else if (sumArray3>sumArray && sumArray3>sumArray2)
        {
            System.out.println("Середнє значення Масиву 3 є найбільшим");
        }
        else if (sumArray==sumArray2 && sumArray==sumArray3)
        {
            System.out.println("Середнє значення Масиву 1,2,3 є однакові");
        }

    }


}
