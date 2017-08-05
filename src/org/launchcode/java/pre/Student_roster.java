package org.launchcode.java.pre;

import java.lang.reflect.Array;
import java.nio.DoubleBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student_roster {
    public static void main(String[] args){
        HashMap<String, Integer> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        String student;

        System.out.println("enter a student name: ");

        do{
            System.out.println("Name: ");
            student = in.nextLine();

            if(!student.equals("")){
                System.out.println("ID: ");
                int id = in.nextInt();
                students.put(student, id);

                in.nextLine();
            }
        }while (!student.equals(""));

        System.out.println("\nStudent roster:");

        for(Map.Entry<String, Integer> student_for : students.entrySet()){
            System.out.println(student_for.getKey()+ " : "+student_for.getValue());
        }
    }
}
