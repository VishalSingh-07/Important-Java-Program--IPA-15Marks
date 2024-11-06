/*
Find the index number of a character in a String
Input1 :
Carrot
a

Output: 1


Input2:
Carrot
z

Output: NA
*/

import java.util.*;
public class IndexNumber_Calculate {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        char ch=scan.nextLine().charAt(0);
        int index=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                index=i;
                break;
            }
        }
        if(index==0){
            System.out.println("NA");
        }
        else{
            System.out.println(index);
        }
        scan.close();
    }
}
