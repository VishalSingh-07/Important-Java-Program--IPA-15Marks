import java.util.Scanner;

public class Sum_of_Even_Digit {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        int sum=0;
        for(int i=0;i<str.length();i++){
            int x=Integer.parseInt(String.valueOf(str.charAt(i)));
            if(x%2==0){
                sum+=x;
            }
        }
        System.out.println(sum);
    }
}
