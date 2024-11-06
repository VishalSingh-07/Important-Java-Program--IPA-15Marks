/*
Write a program that reads in a list of integers and prints out the smallest and largest integer in the list.

Your program should first ask the user to enter the number of integers they want to input. Then it should prompt the user to
enter each integer one by one.

After all the integers have been entered, the program should output the smallest and largest integer in the list.

Input
-------------------------
Enter the number of integers: 5
Enter integer 1: 10
Enter integer 2: -5
Enter integer 3: 20
Enter integer 4: 0
Enter integer 5: 15

Output
-------------------------
Smallest integer: -5
Largest integer: 20

 */

import java.util.*;
public class Large_Small {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter Integer "+(i+1)+": ");
            arr[i]=scan.nextInt();
        }
        int maxi=Integer.MIN_VALUE,mini=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            maxi=Math.max(maxi,arr[i]);
            mini=Math.min(mini, arr[i]);
        }
        System.out.println("Smallest Integer: "+mini);
        System.out.println("Largest Integer: "+maxi);
        scan.close();
    }
}
