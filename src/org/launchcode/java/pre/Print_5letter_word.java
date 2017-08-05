package org.launchcode.java.pre;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Print_5letter_word {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<String> target_list = new ArrayList<>();
        String word;

        System.out.println("Enter a word (or ENTER to finish):");

        do {
            word = in.nextLine();

            if (!word.equals("")) {
                target_list.add(word);
            }

        } while(!word.equals(""));

        List<String> letter5_list = print_5letter_word(target_list);

        for(String letter5_word : letter5_list){
            System.out.println(letter5_word);
        }

    }



    public static List<String> print_5letter_word(ArrayList<String> words){
        ArrayList<String> letter5_list = new ArrayList<>();
        for(String word : words){
            if(word.length() == 5){
                letter5_list.add(word);
            }
        }

        return letter5_list;

    }
}
