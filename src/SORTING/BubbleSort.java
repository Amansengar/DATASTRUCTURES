package SORTING;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {12,43,-35,34,56,23};
        for (int lastunsortedindex = arr.length - 1; lastunsortedindex > 0  ; lastunsortedindex--)
        {
            for (int i = 0; i < lastunsortedindex ; i++)
            {
                if(arr[i] > arr[i+1])
                    swap(arr , i ,i+1) ;
            }


        }
        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public static void swap(int[] array , int i , int j)
    {
        if(i ==j)
        {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }






}
/*  LARGER VALUE WILL BUBBLE TO THE END OR TOP OF THE ARRAY
*   O(N^2) TIME COMPLEXITY - - QUADRATIC
*   IT WILL TAKE 100 STEPS TO SORT 10 ITEMS
*   LEAST EFFICIENT ALGORITHMS : EVEN GOOD TEACHERS DONT TEACH THIS
*
*/
