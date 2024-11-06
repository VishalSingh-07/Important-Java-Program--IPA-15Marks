/*
Find number of lower case in a string
AriJIt = 3
*/

import java.util.*;
public class Count_LowerCase {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i))){
                count++;
            }
        }
        System.out.println(count);

        scan.close();
    }
}
