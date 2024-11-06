import java.util.Scanner;

/*
Write a Java program to check if a given number is an Armstrong number or not.

Here's an example of the expected input and output:

Input number: 153
Output: "Yes, the number is an Armstrong number."

*/
public class ArmStong{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int temp=num;
        int sum=0;
        while(temp>0){
            int digit=temp%10;
            sum+=digit*digit*digit;
            temp/=10;
        }
        if(sum==num){
            System.out.println("Yes, the number is an Armstrong number.");
        }
        else{
            System.out.println("No, the number is not an Armstrong number.");
        }

    }
}
