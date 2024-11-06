/*
Question:
Remove the duplicate character from the String

Input:
Hello Hey

Output:
Helo y

Input:
Hello

Output:
Helo
 */

import java.util.*;

//public class Remove_the_Duplicate_Character_From_the_String {
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        String str=scan.nextLine();
//        String ans="";
//        int n=str.length();
//        for(int i=0;i<n;i++){
//            for(int j=0;j<=i;j++){
//                if(i==j){
//                    ans+=str.charAt(i);
//                }
//                else{
//                    if(str.charAt(i)==str.charAt(j)){
//                        break;
//                    }
//                }
//            }
//        }
//        System.out.println(ans);
//
//    }
//}


// OR

//public class Remove_the_Duplicate_Character_From_the_String {
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        HashSet<Character> exist=new HashSet<>();
//        String str=scan.nextLine();
//        String ans="";
//        for(int i=0;i<str.length();i++){
//            char ch=str.charAt(i);
//            if(!exist.contains(ch)){
//                ans+=ch;
//                exist.add(ch);
//            }
//        }
//        System.out.println(ans);
//
//    }
//}

// OR

public class Remove_the_Duplicate_Character_From_the_String {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        int[] freq=new int[256];
        String ans="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(freq[ch]==0){
                ans+=ch;
                freq[ch]++;
            }
        }
        System.out.println(ans);

    }
}
