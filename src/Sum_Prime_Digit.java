/*
Count the sum of prime digits in a given number

Input: 2345678910
Output: 17
Explaination: 2+3+5+7 = 17

*/
import java.util.*;
public class Sum_Prime_Digit {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        int sum=0;
        for(int i=0;i<str.length();i++){
            int x=Integer.parseInt(String.valueOf(str.charAt(i)));
            if(isPrime(x)){
                sum+=x;
            }
        }
        System.out.println(sum);
    }
    public static boolean isPrime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;

    }
}
