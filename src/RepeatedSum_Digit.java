/*
Calculate the sum of all digits of a numbers. If the sum is greater than 9 then again
sum the digits. The sum is continuing until the sum becomes one digit.

Input : 195
Output : 6

Explanation: 1+9+5 =15>9, so 1+5=6 */

import java.util.*;
public class RepeatedSum_Digit {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int sum=0;
        int temp=num;
        do{
            sum=sumDigit(temp);
            temp=sum;
        }while(sum>9);
        System.out.println(sum);
    }
    public static int sumDigit(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit;
            n/=10;
        }
        return sum;
    }
}
