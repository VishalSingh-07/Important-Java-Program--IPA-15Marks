import java.util.*;
public class Practice2 {
    public static void main(String[] args) {
        int a=0,b=0;
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='*')
            {
                a++;
            }
            if(str.charAt(i)=='#')
            {
                b++;
            }
        }
        System.out.println(a-b);
    }
}
