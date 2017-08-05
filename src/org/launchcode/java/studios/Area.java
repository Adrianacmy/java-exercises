package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        try{

            double radius = in.nextDouble();

            while (radius < 0){
                System.out.println("Enter the radius: ");
                radius = in.nextDouble();
            }
            double area = Count.get_area(radius);
            System.out.println(area);

        }catch (Exception e){
            System.out.println("Invalid input, radius can only be double.");
        }

    }
}
