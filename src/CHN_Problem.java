/*
Question:

Input:
CHNKSC

Output:
CSK

Explanation:
If the String contain CHN then print last character till CHN of the string in reverse order
 */

import java.util.*;
public class CHN_Problem {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        if(str.contains("CHN")){
            for(int i=str.length()-1;i>=3;i--){
                System.out.print(str.charAt(i));
            }
        }
        else{
            System.out.println("Nothing");
        }
    }
}
