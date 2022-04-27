package com.company;

public class Task5
{
    public static void main(String[] args)
    {
        int k = 0;
        int array[] = new int[15];
        System.out.print("Масив - ");
        for (int i = 0; i<=14; i++)
        {
            array[i] = (int)(Math.random() * 10);
            System.out.print(array[i] + " ");
            if (array[i] % 2 == 0)
            {
                k++;
            }
        }
        System.out.println();
        System.out.println("Кількість парних елементів в масиві - " + k);

    }
}
