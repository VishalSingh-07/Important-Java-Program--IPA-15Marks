/*
Question:
Count the Number of words in a string

Input:
Welcome to My Word of Programming

Output:
The Number of Words are:6

Explaination:
Welcome,to,My,World,of,Programming
 */

import javax.swing.plaf.synth.SynthTextAreaUI;
import  java.util.*;

public class Find_the_Count_of_number_of_words_in_a_string {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        count++;
        System.out.println("The Number of Words are: "+count);
    }
}

// OR

//public class Find_the_Count_of_number_of_words_in_a_string {
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        String str=scan.nextLine();
//        String[] arr=str.split(" ");
//        System.out.println("The Number of Words are: "+arr.length);
//    }
//}