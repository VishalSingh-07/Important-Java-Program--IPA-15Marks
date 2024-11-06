/*
Find the characters in odd position of a string which are consonent:

Input: Arijit Ghosh
Output: rjtGh
 */
import java.util.Scanner;

public class Consonant_OddPosition {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        for(int i=0;i<str.length();i++){
            if(Character.isLetter(str.charAt(i))){
                if(isConsonant(str.charAt(i)) && i%2!=0){
                    System.out.print(str.charAt(i));
                }
            }
        }
    }
    public static boolean isConsonant(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
              return false;
        }
        return true;
    }
}
