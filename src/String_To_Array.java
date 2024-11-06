import java.util.Arrays;
import java.util.Scanner;

public class String_To_Array {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        char[] arr=new char[str.length()];
        for(int i=0;i<str.length();i++){
            arr[i]=str.charAt(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
