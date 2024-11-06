/*
Find largest word from a given sentence

Input: He is so funny boy
Output: funny
 */

import java.util.*;
public class Largest_Word {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String[] strArr=str.split(" ");
        String largestWord="";
        for(int i=0;i<strArr.length;i++){
            if(strArr[i].length()>largestWord.length()){
                largestWord=strArr[i];
            }
        }
        System.out.println(largestWord);
    }
}
