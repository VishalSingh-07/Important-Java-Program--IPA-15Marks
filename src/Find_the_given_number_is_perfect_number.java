/*
Question:
Check whether the given number is perfect number or not

Input:
6

Output:
The Number is perfect

Explaination:
The factors of 6 are:1,2,3 and the sum of them are 1+2+3=6
which is equal to the input given so it is a perfect number


Input:
8

Output:
The Number is not perfect

Explaination:
The factors of 8 are:,1,2,4 and the sum of them are 1+2+4=7
which is not equal to the perfect number so it is not a perfect number

*/
import java.util.*;
public class Find_the_given_number_is_perfect_number {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(n==sum){
            System.out.println("The Number is perfect");
        }
        else{
            System.out.println("The Number is not perfect");
        }
    }
}
