/*
Question:
Find the sum and count of the number who is divisible by 3 and 2 within a specified range

Input:
a=12,b=100


Output:
Sum=810
Count=15

Explanation:
12
18
24
30
36
42
48
54
60
66
72
78
84
90
96

*/


import java.util.*;
public class Divisible_by_3_and_2_within_a_Range {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int sum=0,count=0;
        for(int i=a;i<=b;i++){
            if(i%3==0 && i%2==0){
                sum+=i;
                count++;
            }
        }
        System.out.println("Sum: "+sum);
        System.out.println("Count: "+count);
        scan.close();

    }
}
