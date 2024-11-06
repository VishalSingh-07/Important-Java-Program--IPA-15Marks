import java.util.*;
public class Print_Each_Word_of_A_String {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String[] word=str.split(" ");
        for(int i=0;i<word.length;i++){
            System.out.println(word[i]);
        }
        scan.close();
    }
}
