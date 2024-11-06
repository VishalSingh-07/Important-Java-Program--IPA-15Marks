/*
Find the occurance of each character in a string
Input: Hello world
Output:
 H: 1
 e: 1
 l: 3
 o: 2
 w: 1
 r: 1
 d: 1
*/

import java.util.*;
public class Occurance {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine().replace(" ","");
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if (hashMap.containsKey(ch)) {
                hashMap.put(ch, hashMap.get(ch) + 1);
            } else {
                hashMap.put(ch, 1);
            }
        }
        for(Map.Entry<Character,Integer> entry: hashMap.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
}
