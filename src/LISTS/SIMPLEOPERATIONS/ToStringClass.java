package LISTS.SIMPLEOPERATIONS;
import  java.util.*;
public class ToStringClass {

    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student("AMAN", 20));
        al.add(new Student("GOLU", 21));

        for (Student s : al) {
            System.out.println(s);
        }
    }

}
