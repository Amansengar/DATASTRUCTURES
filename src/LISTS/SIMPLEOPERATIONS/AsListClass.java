package LISTS.SIMPLEOPERATIONS;

import java.util.*;

public class AsListClass {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>
                (Arrays.asList(2,5,8,9,12));
        System.out.println("ELEMENTS ARE: " +al);
        al.add(25);
        al.remove(2);
        /*
         int indexOf(Object o): Gives the index of the object o.
         If the element is not found in the list then this method returns the value -1.
         String str= obj.get(2);
         */
        int pos = al.get(2);
        System.out.println("POSITION AT 2: " + pos);
        int n =al.size();
        System.out.println("TOTAL ELEMENTS:"  + n);
        System.out.println(al.contains(15));
        System.out.println(al.contains(25));
        // ITERATING ARRAYLIST

        for(Integer i :al)
            System.out.println(i);
    }


}
