/*
Last Character of each word of a sentence

Input: Kalyani Government Engineering College
Output: itge
 */
import java.util.*;
public class LastChar {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String ans="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                if(Character.isAlphabetic(str.charAt(i-1))){
                    ans+=str.charAt(i-1);
                }
            }
        }
        ans+=str.charAt(str.length()-1);
        System.out.println(ans);
    }
}
