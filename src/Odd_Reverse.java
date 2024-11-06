/*
Take a number. If it odd then reverse it, otherwise print "Can not reverse"
Input : 123
Output : 321
Input : 234
Output : Can not reverse
 */
import java.util.*;
public class Odd_Reverse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        if(num%2!=0){
            int rev=0;
            while(num>0){
                int digit=num%10;
                rev=rev*10+digit;
                num/=10;
            }
            System.out.println(rev);
        }
        else{
            System.out.println("Cannot Reverse");
        }
    }
}
