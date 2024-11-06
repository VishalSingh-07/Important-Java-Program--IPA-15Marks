/*
Given two string s and t, return true if t is an anagram of s, and false otherwise.

Example1:
Input: s="anagram", t="nagaram"
Output: true

Example2:
Input: s="rat", t="car"
Output: false

Constraints:
1<=s.length, t.length<=5*10^4
s and t consist of lowercase English letters
*/

import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        String t=scan.nextLine();

        if(s.length()!=t.length()){
            System.out.println("false");
            return;
        }
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            if(freq[t.charAt(i)-'a']-- <= 0){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
