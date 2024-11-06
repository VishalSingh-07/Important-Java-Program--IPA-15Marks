/*
Count the words in a sentence which are start with vowel.

Input: Arijit is student of MCA
Output: 3

Input: Sara plays tennis
Output: No such words

*/
import java.util.*;
public class Count_Word_Vowel {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String[] strArr=str.split(" ");
        int count=0;
        for(int i=0;i<strArr.length;i++){
            if(isVowel(strArr[i].charAt(0))){
                count++;
            }
        }
        if(count>0){
            System.out.println(count);
        }
        else{
            System.out.println("No such words");
        }

    }
    public static boolean isVowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
            return true;
        }
        return false;
    }
}
