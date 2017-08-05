package org.launchcode.java.pre;

import java.util.ArrayList;
import java.util.Arrays;

public class Print_element {
    public static void main(String[] args) {
        ArrayList<Integer> my_list = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 5, 8));
        for(int n : my_list){
            System.out.println(n);
        }

    }
}
