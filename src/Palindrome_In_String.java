/*
Find the palindrome words from the sentence and print them and also count

Input:
----------------
My name is nitin and I can speak malayalam

Output:
----------------
nitin
I
malayalam
3
*/
import  java.util.*;
public class Palindrome_In_String {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String[] strArr=str.split(" ");
        int count=0;
        for(int i=0;i<strArr.length;i++){
            if(isPalindrome(strArr[i])){
                System.out.println(strArr[i]);
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean isPalindrome(String s){
        String reversedString="";
        for(int i=s.length()-1;i>=0;i--){
            reversedString+=s.charAt(i);
        }
        if(s.equals(reversedString)){
            return true;
        }
        return false;
    }
}
