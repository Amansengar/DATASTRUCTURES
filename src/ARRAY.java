public class ARRAY {


    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 20;
        arr[1] = 25;
        arr[2] = 30;
        arr[3] = 35;
        arr[4] = 40;
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
/* CONTIGUOUS BLOCK IN MEMORY */
/*  TELLS JVM ABOUT ALLOCATION OF CONTIGUOUS MEMORY */
/*   EVERY ELEMNET OCCUPIES THE SAME AMOUNT OF SPACE IN MEMORY */