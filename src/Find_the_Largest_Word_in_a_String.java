/*
Find the Largest Word in a String

Input: Hey Hello you are having any trouble

Output:trouble

Explaination:

Hey:3
Hello:3
you:3
are:3
having:6
any:6
trouble:7

The Word "trouble" is having high Length, so "trouble" is the output
*/
import java.util.*;
public class Find_the_Largest_Word_in_a_String {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String[] arr=str.split(" ");
        int max=Integer.MIN_VALUE;
        String longestWord="";
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>longestWord.length()){
                longestWord=arr[i];
            }
        }
        System.out.println(longestWord);
    }
}
