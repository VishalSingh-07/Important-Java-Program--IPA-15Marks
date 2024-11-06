/*
Sort name by dictionary order

Input:
-----------------
Arijit
Minaz
Arnab


Output
-------------------
Arijit
Arnab
Minaz
 */
import java.util.*;

//public class Sorting_Name {
//    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        String[] str=new String[3];
//        String name = "";
//        for (int i = 0; i < str.length; i++) {
//            str[i] = scan.nextLine();
//        }
//        Arrays.sort(str);
//        for (int i = 0; i < str.length; i++) {
//            System.out.println(str[i]);
//        }
//    }
//}


public class Sorting_Name {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String[] str=new String[3];
        String name = "";
        for (int i = 0; i < str.length; i++) {
            str[i] = scan.nextLine();
        }
        for(int i=0;i<str.length;i++){
            for(int j=i+1;j<str.length;j++){
                if(str[i].compareTo(str[j])>0){
                    name=str[i];
                    str[i]=str[j];
                    str[j]=name;
                }
            }
        }
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
