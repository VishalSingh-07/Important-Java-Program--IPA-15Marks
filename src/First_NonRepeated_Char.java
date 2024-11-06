/*
Write a Java program to find the first non-repeated character in a given string.

Here's an example of the expected input and output:

Input string: "minimum"
Output: "n"

*/

import java.util.*;
public class First_NonRepeated_Char {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count==0){
                System.out.println(str.charAt(i));
                break;
            }
        }
        scan.close();
    }
}
