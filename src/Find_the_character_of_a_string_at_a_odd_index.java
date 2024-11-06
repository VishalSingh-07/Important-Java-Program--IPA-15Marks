/*
Find the characters of a string at odd index

Input:
HelloWorld

Output:
elWrd

Explaination:

H e l l o  W o r l d
0 1 2 3 4 5 6 7 8 9

*/

import java.util.*;
//public class Find_the_character_of_a_string_at_a_odd_index {
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        String str=scan.nextLine();
//        String ans="";
//        for(int i=0;i<str.length();i++){
//            if(i%2!=0){
//                ans+=str.charAt(i);
//            }
//        }
//        System.out.println(ans);
//    }
//}

//  OR

public class Find_the_character_of_a_string_at_a_odd_index {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        for(int i=0;i<str.length();i++){
            if(i%2!=0){
                System.out.print(str.charAt(i));
            }
        }
    }
}
