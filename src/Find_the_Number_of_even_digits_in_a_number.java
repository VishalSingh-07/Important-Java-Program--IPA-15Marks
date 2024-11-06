/*
Write the program to count the number of even digits in a number

Question:
Find the Number of even digits in a number. If it is greater than 2 then print true otherwise false

Input:
14236

Output:
TRUE

Input:
1459

Output:
FALSE
*/


import java.util.*;

public class Find_the_Number_of_even_digits_in_a_number {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int count=0;
        while(num>0){
            int digit=num%10;
            if(digit%2==0){
                count++;
            }
            num/=10;
        }
        if(count>2){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }
    }
}
