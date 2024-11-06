/*
Find first letter of each word in a string
Input : Kalyani Govt. Eng. College
Output : KGEC
*/
import java.util.*;
//public class First_Letter_of_each_word {
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        String str=scan.nextLine();
//        String[] strArr=str.split(" ");
//        for(int i=0;i< strArr.length;i++){
//            System.out.print(strArr[i].charAt(0));
//        }
//        scan.close();
//    }
//}

public class First_Letter_of_each_word {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String ans="";
        ans+=str.charAt(0);
        for(int i=1;i< str.length();i++){
            if(str.charAt(i)==' '){
                ans+=str.charAt(i+1);
            }
        }
        System.out.println(ans);
        scan.close();
    }
}