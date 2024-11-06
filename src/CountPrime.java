/*
Count number of prime digit in a Number
Input : 254786135
Output : 5
*/

import java.util.*;
public class CountPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str=scan.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            int temp=Integer.parseInt(String.valueOf(str.charAt(i)));
            if(isPrime(temp)){
                count++;
            }
        }
        System.out.println(count);
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
