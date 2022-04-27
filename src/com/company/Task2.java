package com.company;

public class Task2
{
    public static void main(String[] args)
    {
        int array[] = new int[20];
        System.out.print("Масив 1 - ");
        for(int i = 0; i<=19; i++)
        {
            array[i] = (int)(Math.random() * 9);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.print("Масив 2 - ");
        for (int i = 0; i <=19; i++)
        {
            if (i % 2 == 0)
            {
                array[i] = 0;
            }
            System.out.print(array[i]+" ");
        }
    }
}