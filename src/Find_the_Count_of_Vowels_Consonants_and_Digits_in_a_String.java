/*
Question:
Count the Number of vowels, consonents and digit in a String

Input:
Welcome1234

Output:
Number of Vowels:3
Number of Consonents:4
Number of Numbers:4
*/

import java.util.*;
public class Find_the_Count_of_Vowels_Consonants_and_Digits_in_a_String {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        int vowels=0,consonants=0,digits=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
                    ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                    vowels++;
                }
                else{
                    consonants++;
                }
            }
            else if(ch>=48 && ch<=57){
                digits++;
            }
        }
        System.out.println("Number of Vowels: "+vowels);
        System.out.println("Number of Consonant: "+consonants);
        System.out.println("Number of Digits: "+digits);

    }
}


// OR

//public class Find_the_Count_of_Vowels_Consonants_and_Digits_in_a_String {
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        String str=scan.nextLine();
//        int vowels=0,consonants=0,digits=0;
//        for(int i=0;i<str.length();i++){
//            char ch=str.charAt(i);
//            if(Character.isLetter(ch)){
//                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
//                        ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
//                    vowels++;
//                }
//                else{
//                    consonants++;
//                }
//            }
//            else if(Character.isDigit(ch)){
//                digits++;
//            }
//        }
//        System.out.println("Number of Vowels: "+vowels);
//        System.out.println("Number of Consonant: "+consonants);
//        System.out.println("Number of Digits: "+digits);
//
//    }
//}