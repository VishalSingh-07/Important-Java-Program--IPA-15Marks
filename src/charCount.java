/*
Find occurance of a character in a string
 Input
 --------------
 Priyanka
 a

 Output
 ----------------
 2
 */
import java.util.*;
public class charCount {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        char ch=scan.nextLine().charAt(0);
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                count++;
            }
        }
        System.out.println(count);
    }
}
