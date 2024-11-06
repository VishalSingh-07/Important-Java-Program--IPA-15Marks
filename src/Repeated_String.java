/*

## Repeated String

Input: "Hello@123World456"

Process:

Array: ["Hello", "@", "123", "World", "456"]

Now you should concatenate all the strings in the array and multiply it with the
sum of the position of that array where numbers are stored.

Sum of positions of numbers in the array = 3 + 5 = 8
Concatenated string = "Hello@123World456"
Result = 8 * "Hello@123World456" = "Hello@123World456Hello@123World456Hello@123World456Hello@123World456Hello@123World456
Hello@123World456Hello@123World456Hello@123World456"

Output:
"Hello@123World456Hello@123World456Hello@123World456Hello@123World456Hello@123World456Hello@123World456Hello@123World456
Hello@123World456"

*/
import java.util.*;

public class Repeated_String {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        ArrayList<String> arr=new ArrayList<>();
        String alphabet="";
        String number="";
        String symbol="";
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if (Character.isAlphabetic(ch)) {
                alphabet += ch;
                if (number != "") {
                    arr.add(number);
                    number = "";
                } else if (symbol != "") {
                    arr.add(symbol);
                    symbol = "";
                }

            } else if (Character.isDigit(ch)) {
                number += ch;
                if (alphabet != "") {
                    arr.add(alphabet);
                    alphabet = "";
                } else if (symbol != "") {
                    arr.add(symbol);
                    symbol = "";
                }
            } else {
                symbol += ch;
                if (alphabet != "") {
                    arr.add(alphabet);
                    alphabet = "";
                } else if (number != "") {
                    arr.add(number);
                    number = "";
                }
            }
        }
        if (number != "") {
            arr.add(number);

        } else if (symbol != "") {
            arr.add(symbol);
            symbol = "";
        } else {
            arr.add(alphabet);
            alphabet = "";
        }
        int position=0;
        for(int i=0;i<arr.size();i++){
            if(Character.isDigit(arr.get(i).charAt(0))){
                position+=(i+1);
            }
        }

        for(int i=0;i<position;i++){
            System.out.print(str);
        }
    }
}
