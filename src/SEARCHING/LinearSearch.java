package SEARCHING;

import java.util.Arrays;

public class LinearSearch
{

    public static void main(String[] args)
    {
        int size = 10;
        int[] numbers = new int[size];
        for (int i = 0; i <numbers ; i++)
        {
            numbers[i] =(int)(Math.random()*10);
        }
        int value = 5;
        int pos = -1;
        for (int i = 0; i < numbers.length; i++)
        {
        if(numbers[i] == value)
            [
                    pos = i;
                    break;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }








}
