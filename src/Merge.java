/*

Marge two strings using comma

Input:
Arijit,Ghosh
Pop:Mom

Output:
Arijit, Ghosh, Pop:Mom
*/

import  java.util.*;
public class Merge {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s1=scan.nextLine();
        String s2=scan.nextLine();
        String[] arr1=s1.split(",");
        String[] arr2=s2.split(",");
        for(int i=0;i< arr2.length;i++){
            arr1=Arrays.copyOf(arr1,arr1.length+1);
            arr1[arr1.length-1]=arr2[i];
        }
        String s3=Arrays.toString(arr1);
        String ans = s3.substring(1, s3.length()-1);
        System.out.println(ans);
    }
}
