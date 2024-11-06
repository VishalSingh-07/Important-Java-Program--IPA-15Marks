//a2b3c1 = aabbbc

import  java.util.*;
public class Repeated_Number {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String ans="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isAlphabetic(ch)){
                ans+=ch;
            }
            else if(Character.isDigit(ch)){
                int x=Integer.parseInt(String.valueOf(ch));
                for(int j=1;j<x;j++){
                    ans+=str.charAt(i-1);
                }
            }
        }
        System.out.println(ans);
    }
}
