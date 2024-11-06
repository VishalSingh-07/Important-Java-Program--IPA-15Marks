/*
Write a Java program to find the sum of all even numbers in an array of integers.

Here's an example of the expected input and output:

Input array: {10, 5, 20, 8, 13}
Output:
Sum of even numbers: 38

*/
import java.util.Scanner;

public class SumEven {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] arr=new int[5];
        int sum=0;
        for(int i=0;i<5;i++){
            arr[i]=scan.nextInt();
            if(arr[i]%2==0){
                sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
}
