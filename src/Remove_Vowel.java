/*
Remove Vowel From A String

Input : Arijit Ghosh
Output : rjt Ghsh
 */

import java.util.*;
public class Remove_Vowel {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String ans="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u'&& ch!='A' && ch!='E' && ch!='I' && ch!='O' && ch!='U'){
                ans+=ch;
            }
        }
        System.out.println(ans);
    }
}
