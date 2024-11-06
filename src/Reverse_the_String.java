/*
Question:
Find the reverse of the String

Input:
Hello World

Output:
dlroW olleH
 */

import  java.util.*;

public class Reverse_the_String {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}

// OR

//public class Reverse_the_String {
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        String str=scan.nextLine();
//        String ans="";
//        for(int i=0;i<str.length();i++){
//            ans=str.charAt(i)+ans;
//        }
//        System.out.println(ans);
//    }
//}


// OR

//public class Reverse_the_String {
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        String str=scan.nextLine();
//        String [] arr=str.split(" ");
//        for(int i=arr.length-1;i>=0;i--){
//            reverseWord(arr[i]);
//            System.out.print(" ");
//        }
//    }
//    public static void reverseWord(String s){
//        for(int i=s.length()-1;i>=0;i--){
//            System.out.print(s.charAt(i));
//        }
//    }
//}