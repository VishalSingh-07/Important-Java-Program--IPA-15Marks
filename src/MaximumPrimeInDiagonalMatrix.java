/*
12 4  8
5  7  6
4  8  10

Maximum prime of the 2 diagonals 1n
*/

import java.util.*;
public class MaximumPrimeInDiagonalMatrix {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter number of row/column: ");
        int n=scan.nextInt();
        int[][] matrix=new int[n][n];
        int[] diagonal1=new int[n];
        int[] diagonal2=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=scan.nextInt();
                if(i==j){
                    diagonal1[i]=matrix[i][j];
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==(n-1-j)){
                    diagonal2[i]=matrix[i][j];
                }
            }
        }

        int[] result=new int[diagonal1.length+diagonal2.length];
        System.arraycopy(diagonal1, 0, result, 0, n);
        System.arraycopy(diagonal2, 0, result, diagonal1.length, diagonal2.length);
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<result.length;i++){
            if(isPrime(result[i])){
                maxi=Math.max(maxi,result[i]);
            }
        }
        System.out.println("The maximum prime : "+maxi);
    }
    public static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
