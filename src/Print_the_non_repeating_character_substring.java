/*
Question:

Find the first non-repeated character substring

Input:
Hello

Output:
Hel
*/

import java.util.*;
public class Print_the_non_repeating_character_substring {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        int n=str.length();
        String ans="";
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<=i;j++){
                if(i==j){
                    ans+=str.charAt(i);
                }
                else{
                    if(str.charAt(i)==str.charAt(j)){
                        count++;
                        break;
                    }
                }
            }
            if(count>0){
                break;
            }
        }
        System.out.println(ans);

    }
}
