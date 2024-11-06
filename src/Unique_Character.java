/*
Problem Statement
Write a Java program to print the unique characters present in the given string in the
same sequence as they appear(the first occurrence) in the input.

Note:
All the characters should be in lowercase only.

i/p ->
xperience

o/p ->
xperinc
*/

import java.util.*;
public class Unique_Character {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        str=str.toLowerCase();
        int[] freq=new int[256];
        String ans="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(freq[ch]==0){
                ans+=ch;
            }
            freq[ch]++;
        }
        System.out.println(ans);
    }
}
