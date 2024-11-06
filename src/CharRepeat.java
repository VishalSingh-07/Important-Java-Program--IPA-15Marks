/*
String Compression Problem

Description: Given a string, compress it by replacing consecutive repeated characters with the character
followed by the number of repetitions. For example, the string "aabbbcc" should be compressed to "a2b3c2",
while "abbccc" should become "a1b2c3".

Input:
A string consisting of lowercase letters.

Output:
A compressed string where consecutive characters are replaced by the character followed by its count.


Examples:

Example 1: Input: aabbbcc Output: a2b3c2

Example 2: Input: abbccc Output: a1b2c3

Constraints:

The input string will only contain lowercase letters (a-z).
The length of the input string will not exceed 1000 characters.
 */

import java.util.*;
public class CharRepeat {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        HashMap<Character, Integer> hashMap=new HashMap<Character,Integer>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            // Check if the character is already in the map
            if (hashMap.containsKey(ch)) {
                // Increment the count
                hashMap.put(ch, hashMap.get(ch) + 1);
            } else {
                // Initialize count to 1
                hashMap.put(ch, 1);
            }
        }
        for (char i : hashMap.keySet()) {
            System.out.print(i+""+hashMap.get(i));
        }
    }
}
