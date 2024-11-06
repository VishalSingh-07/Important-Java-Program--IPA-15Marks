/*
Question:
Find the Number of Lower case letters in a String

Input:
WelComeToMyJAva

Output:
The Number of Lowercase letters are:9
 */

import java.util.*;
public class Find_the_Number_of_lowercase_letters {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>=97 && str.charAt(i)<=122){
                count++;
            }

            // OR
            /*
            if(Character.isLowerCase(str.charAt(i))==true){
                count++;
            }

             */
        }
        System.out.println("The Number of Lowercase letters are: "+count);
    }
}
