/*

Count the number of words in a sentence that contain at least two consecutive vowels (a, e, i, o, u) in them.


Here's a sample input and output:

Input: I enjoy eating spaghetti and meatballs for dinner
Output: 2

Explanation: There are two words in the sentence that contain at least two consecutive vowels - "enjoy" and "meatballs".

*/

import java.util.*;
public class Consecutive_two_vowels {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        s=s.toLowerCase();
        String[] str=s.split(" ");
        int count=0;
        for(int i=0;i<str.length;i++){
            for(int j=0;j<str[i].length()-1;j++){
                if(isVowel(str[i].charAt(j))==true && isVowel(str[i].charAt(j+1))==true){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
    public static boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            return true;
        }
        return false;
    }

}
