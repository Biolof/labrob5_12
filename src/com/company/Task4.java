package com.company;

public class Task4
{
    public static void main(String[] args)
    {
        int array[]=new int[10];
        int array2[]=new int[10];
        int array3[]=new int[10];
        System.out.print("Масив 1 - ");
        for(int i = 0; i<=9; i++)
        {
            array[i] = (int)(Math.random() * 10);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.print("Масив 2 - ");
        for(int j = 0; j<=9; j++)
        {
            array2[j] = (int)(Math.random() * 10);
            System.out.print(array2[j]+" ");
        }
        System.out.println();
        System.out.print("Масив 3 - ");
        for (int k = 0;k<=9;k++)
        {
          array3[k] = array[k] + array2[k];
            System.out.print(array3[k]+" ");
        }


    }
}
