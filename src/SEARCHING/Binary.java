package SEARCHING;

public class Binary
{
    public static void main(String[] args) {

        int size = 10;
        int [] numbers = new int[size);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (i+1);
        }
        int value= 4;
        public static int binarysearch(int[]array , int value)
        {
            int pos =-1;
            int beg = 0;
            int end = array.length-1,mid;
            while(beg <=  end)
            {
                mid = (big + end) / 2;
            }
            if(array[mid] ==  value)
            {
                pos = mid;
                break;
            }
            else if (array[mid] > value)
            {

                end = mid -1;
            }
            else
                {
                    beg = mid +1;
                }


        }


    }




}
