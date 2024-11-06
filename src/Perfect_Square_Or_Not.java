/*
The perfect square or square number is a positive integer that is square of an integer.
In other words, when we multiply two same numbers together, then the product that we get
is called the perfect square. In short, it is the product of two positive equal integers
or product of an integer with itself.

The property of the perfect square number is that it ends only with 0, 1, 4, 6, 9, and 25.
The examples of perfect square are:

49=7*7
100=10*10
625=25*25
*/
import java.util.*;
public class Perfect_Square_Or_Not {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        double res=Math.sqrt(num);
        if((int)res==res){
            System.out.println("Perfect Square");
        }
        else{
            System.out.println("Not a perfect square");
        }
        scan.close();
    }
}
