/*
Question:

Find the average of the number according to the limits

Input:

Enter the size of array: 5
Enter the Array: 1 2 3 4 5
Enter the Limit1: 2
Enter the limit2: 6

Output:
4

Explanation:
3 + 4 + 5 = 12/3 => 4

*/
import java.util.*;
public class Find_Average_of_the_number_according_to_limit {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n=scan.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter the Array: ");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.print("Enter the Limit1: ");
        int limit1=scan.nextInt();
        System.out.print("Enter the limit2: ");
        int limit2=scan.nextInt();

        int sum=0,count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>limit1 && arr[i]<limit2){
                sum+=arr[i];
                count++;
            }
        }
        System.out.println(sum/count);

    }
}
