public class TESTFILE {

        public static void main(String[] args) {
            int[] arr = {12,34,-7,35,25,15};
            for (int lastunsortedindex = arr.length - 1; lastunsortedindex > 0 ; lastunsortedindex--)
            {
                int largest = 0;
                for (int i = 1; i <= lastunsortedindex; i++)
                {
                    if (arr[i] > arr[largest])
                    {
                        largest = i;
                    }
                }
                swap(arr , largest , lastunsortedindex);


            }
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }

        public static void swap (int[] array , int i , int j)
        {
            if(i == j)
            {
                return;
            }
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;

        }


    }


