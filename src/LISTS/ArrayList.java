package LISTS;

import java.util.*;

public class ArrayList {


    public static void main(String[] args) {
        List<Employee> employeeList;
        employeeList = new java.util.ArrayList<>();
        employeeList.add(new Employee("AMAN", "SENGAR", 21));
        employeeList.add(new Employee("AMAN", "PRATAP", 22));
        employeeList.add(new Employee("AMAN", "SINGH", 20));
        employeeList.forEach(employee -> System.out.println(employee));
    }
    }
//
//* PROPERTIES OF DATA
//* OPERATIONS ON THAT DATA
//* THESE TWO DEFINE ABSTRACT DATA TYPE
//*ABSTRACT DATA TYPE : IS A DATA TYPE WHOSE BEHAVIOUR IS DEFINED BY A SET OF VALUES AND A SET OF OPERATIONS
//*WHY THESE ARE CALLED ABSTRACT :: BECAUSE THESE IMPLEMENTATIONS
//*
//*
