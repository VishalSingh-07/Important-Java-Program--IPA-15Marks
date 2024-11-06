/*
Find the Maximum Ascii valued character in a String
Arijit = t
priyanka = y
Aa = a
 */
import java.util.*;
public class MaximumAscii {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        char ch=str.charAt(0);
        for(int i=1;i<str.length();i++){
            if(ch<str.charAt(i)){
                ch=str.charAt(i);
            }
        }
        System.out.println(ch);
    }
}
