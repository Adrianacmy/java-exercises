package org.launchcode.java.pre;

import java.util.ArrayList;
import java.util.Arrays;

public class Sum_even_numbers {
    public static void main(String[] args){
        ArrayList<Integer> even_num = new ArrayList<Integer>(Arrays.asList(1,2,5,78,12,64,35,89, 45, 10));
        System.out.println(sum_even_number(even_num));

    }

    public static int sum_even_number(ArrayList<Integer> lst){
        int sum = 0;
        for(int num : lst){
            if(num%2 == 0){
                sum += num;
            }
        }
        return sum;
    }
}
