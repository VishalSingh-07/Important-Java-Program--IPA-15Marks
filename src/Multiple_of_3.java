/*
Question 1 - Multiple of 3

Write main method in Solution class.

In the main method , read an Integer (containing only numeric digits without decimal and
special characters) and check whether the sum of its digits is in multiple of 3.

If the given input is in multiple of 3, then print TRUE (as a String) else print FALSE(as a String).


For example: if the given value is 333, 3+3+3 is 9. which is multiple of 3, hence TRUE has to
printed.


Sample Input1:
333

Output:
TRUE


Sample Input2:
200

Output:
FALSE
 */
import java.util.*;
public class Multiple_of_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        if (sum % 3 == 0) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}
