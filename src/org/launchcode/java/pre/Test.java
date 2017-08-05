package org.launchcode.java.pre;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args){
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1,2,45,6,89,45,20,30,789));
        System.out.println( System.identityHashCode(myList));
        System.out.println(myList);

        myList.add(6);
        System.out.println(System.identityHashCode(myList));
        System.out.println(myList);

    }
}
