/* I
nput : Home, Sweet Home
       Home
Output : Number of that word present in the sentence : 2

Process
----------
The word Home present in the sentence 2 times
 */
import java.util.*;
//public class Find_CountWord {
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        String str=scan.nextLine();
//        String s=scan.nextLine();
//        String[] strArr=str.split("[\\W+]");
//        int count=0;
//        for(String st: strArr){
//            if(st.equals(s)){
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
//}


public class Find_CountWord {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String s=scan.nextLine();
        String[] strArr=str.split(" ");
        int count=0;
        for(int i=0;i< strArr.length;i++){
            String temp="";
            for(int j=0;j<strArr[i].length();j++){
                if(Character.isLetter(strArr[i].charAt(j))){
                    temp+=strArr[i].charAt(j);
                }
            }
            if(temp.equals(s)){
                count++;
            }
        }
        System.out.println(count);
    }
}