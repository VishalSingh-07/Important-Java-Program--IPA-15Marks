/*
Question:

Remove the character from the String

Input:
Enter the String:Hello
Enter the Character:l

Ouput:
The String after removing is:Heo
*/

import java.util.*;

//public class Remove_the_character_from_the_string {
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        System.out.print("Enter the String: ");
//        String str=scan.nextLine();
//        System.out.print("Enter the Character: ");
//        char ch=scan.next().charAt(0);
//        String ans="";
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i)!=ch){
//                ans+=str.charAt(i);
//            }
//        }
//        System.out.println("The String after removing is: "+ans);
//    }
//}


public class Remove_the_character_from_the_string {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str=scan.nextLine();
        System.out.print("Enter the Character: ");
        String ch=scan.nextLine();
        String ans=str.replace(ch,"");
        System.out.println("The String after removing is: "+ans);
    }
}

