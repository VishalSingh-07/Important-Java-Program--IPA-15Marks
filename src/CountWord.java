/*
Count number of word in a string

Note : Always ignore the spaces if more than 1 space given between two word

Sample Input : 1
------------------------
Kalyani Goverment Engineering College

Process
---------------------------
[Kalyani, Goverment, Engineering, College]

Output
---------------------------
Number of word : 4
*************************************


Sample Input : 2
------------------------
Kalyani Goverment  Engineering College

Process
---------------------------
[Kalyani, Goverment, , Engineering, College]

Output
---------------------------
Number of word : 4
*/

import java.util.*;
public class CountWord {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String[] strArr=str.split(" ");
        int count=0;
        for(int i=0;i<strArr.length;i++){
            if(strArr[i]!=""){
                count++;
            }
        }
        System.out.println(count);
    }
}
