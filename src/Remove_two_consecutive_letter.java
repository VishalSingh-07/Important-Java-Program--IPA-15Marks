/*

Remove Two Consecutive Letter

You are given a string S consisting of lowercase letters. Your task is to remove all the
consecutive duplicates from the string and output the result.

For example, if the input string is "abbcddeff", the output should be "abcdef".

Input: abbcddeff
Output: abcdef
 */

import java.util.*;
public class Remove_two_consecutive_letter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String ans="";
        char ch=str.charAt(0);
        ans+=ch;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)!=ch){
                ch=str.charAt(i);
                ans+=ch;
            }
        }
        System.out.println(ans);
    }
}
