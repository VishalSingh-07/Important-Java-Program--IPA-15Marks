/*
Find missing number

Input : 1 2 4 8 9 11 12 14
Output : 3 5 6 7 10 13
*/
import java.util.*;
public class Missing {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        ArrayList<Integer> missingNumber=new ArrayList<>();
        for(int i=0;i< arr.length-1;i++){
            int current=arr[i];
            int next=arr[i+1];
            while(current+1<next){
                missingNumber.add(current+1);
                current++;
            }
        }
        System.out.println(missingNumber.toString());
    }
}
