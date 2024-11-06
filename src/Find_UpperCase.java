/*
Given a sentence, Find words that start with a capital letter.

For example, in the sentence "The quick Brown Fox jumps over the lazy dog", there are three words that start with a
capital letter: "The", "Brown", and "Fox". */

import java.util.*;
public class Find_UpperCase {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String[] strArr=str.split(" ");
        int count=0;
        for(int i=0;i< strArr.length;i++){
            if(Character.isUpperCase(strArr[i].charAt(0))){
                count++;
            }
        }
        System.out.println(count);
    }
}
