/*
Count the number of spaces in a string

Question:

Count the number of spaces in the String and if the spaces are greater than or equal to 3 then
it should print the count else it should print the message NAN

Input:
Welcome to my world of programming

Output:
5

Input:
Hello Hi

Output:
NAN
because the space is 1 which is less than 3
*/

import java.util.*;
public class Count_the_number_of_spaces_in_a_string {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        if(count>=3){
            System.out.println(count);
        }else{
            System.out.println("NAN");
        }
    }
}
