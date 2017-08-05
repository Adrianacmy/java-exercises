package org.launchcode.java.studios;

import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.File;

public class Count_char {
    public static void main(String[] args) throws IOException {
//        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque " +
//                "sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit " +
//                "amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget " +
//                "massa. Donec nec velit non ligula efficitur luctus.";
        String str = "";

        File file = new File("/home/adriana/test.txt");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()){
            str += sc.nextLine();
        }

//        Scanner in = new Scanner(System.in);
//        System.out.println("Please enter a string: ");
//        String str = in.nextLine();

        HashMap<Character, Integer> map_c = map_char(str);

        for(Map.Entry<Character, Integer> aC : map_c.entrySet()){
            System.out.println(aC.getKey()+" : "+aC.getValue());
        }

    }

    public static HashMap<Character, Integer> map_char(String str){

        char[] charArray = str.toCharArray();

        HashMap<Character, Integer> char_count = new HashMap<>();

        for(Character c : charArray){
            if (c.isAlphabetic((int) c)){
                if (char_count.containsKey(c)) {
                    char_count.put(c, char_count.get(c) + 1);
                }else{
                    char_count.put(c, 1);
                }
            }
        }

        return char_count;
    }
}
