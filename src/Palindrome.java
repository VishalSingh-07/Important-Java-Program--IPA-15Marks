/*
Check a string is palindrome or not
Input: pop
Output: Palindrome
Input: Papa
Output: None
 */
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String reversedString="";
        for(int i=str.length()-1;i>=0;i--){
            reversedString+=str.charAt(i);
        }
        if(str.equals(reversedString)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("None");
        }
        scan.close();
    }
}
