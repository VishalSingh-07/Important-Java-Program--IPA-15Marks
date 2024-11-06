/*
Majority of an element means if an element is present in an array for more than n/2 times,
where n is the length of the Array

Array = {3, 3, 4, 2, 4, 4, 2, 4, 4} => 4
*/

import java.util.*;
public class Majority {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        boolean flag=false;
        for(int i=0;i<n;i++){
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count>n/2){
                System.out.println(arr[i]);
                flag=true;
            }
        }
        if(flag==false){
            System.out.println("There are no elements");
        }
        scan.close();
    }
}
