/*
Find the last letter of the string

Question:
Find the last letter of the String

Input:
Hello How are You

Output:
oweu

*/

import java.util.*;
public class Find_the_last_letter_of_the_String {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i+1)==' '){
                System.out.print(str.charAt(i));
            }
        }
        System.out.print(str.charAt(str.length()-1));
    }
}
