/*

Count the number of words in a sentence that start and end with the same letter.

Input: Anna asked about the Ginseng recipe
Output: 2

Explanation:
There are two words in the sentence that start and end with the same letter -
"Anna" and "Ginseng". */

import java.util.*;
public class Count_Words_Start_and_End_with_Same_letter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine().toLowerCase();
        String[] strArr=str.split(" ");
        int count=0;
        for(int i=0;i<strArr.length;i++){
            char start=strArr[i].charAt(0);
            char end=strArr[i].charAt(strArr[i].length()-1);
            if(start==end){
                count++;
            }
        }
        System.out.println(count);
    }
}
