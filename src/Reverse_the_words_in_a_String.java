/*
Question:

Reverse the words in a String

Input:
Welcome to my Java Programming

Output:
Programming Java my to Welcome
*/

import java.util.*;
public class Reverse_the_words_in_a_String {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String[] arr=str.split(" ");
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=" "){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
