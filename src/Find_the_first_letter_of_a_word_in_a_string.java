/*
Question:

Find the first letter of each word in a string

Input:
Hello How Are You

Output:
HHAY

*/

import java.util.*;
//public class Find_the_first_letter_of_a_word_in_a_string {
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        String str=scan.nextLine();
//        String [] arr=str.split(" ");
//        for(int i=0;i<arr.length;i++){
//            String temp=arr[i];
//            System.out.print(temp.charAt(0));
//        }
//
//    }
//}


public class Find_the_first_letter_of_a_word_in_a_string {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String ans="";
        ans+=str.charAt(0);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '){
                ans+=str.charAt(i+1);
            }
        }
        System.out.println(ans);

    }
}
