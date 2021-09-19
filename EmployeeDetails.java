package EmployeeData;

import java.sql.SQLOutput;
import java.util.Scanner;

class Employee {
    int yoj;
    String name,add;
}

class EmployeeDetails {
    public static void main(String args[]) {

        int k = 3;
        Scanner sc = new Scanner(System.in);
        Employee emp[] = new Employee[k];

        for (int i = 0; i < k; i++) {
            emp[i] = new Employee();

            System.out.println("\nEnter Employee data :\n\n"+"==========Employee "+(i+1)+"==========");

            System.out.print("Employee name :");
            emp[i].name = sc.next();
            System.out.print("Employee year of joining :");
            emp[i].yoj = sc.nextInt();
            System.out.println("Employee address :");
            emp[i].add = sc.next();
        }

        System.out.println("\n\n============ All employee details are :============\n");

        for (int i = 0; i < k; i++) {
            System.out.println("employee."+(i+1)+"\tname-"+emp[i].name+"\tyear of joining-"+emp[i].yoj+"\taddress-"+emp[i].add);


        }
    }
}