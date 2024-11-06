// Intersection between two given set

import  java.util.*;

public class Intersection_of_set {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] set1 = new int[4];
        int[] set2 = new int[5];
        ArrayList<Integer> intersection=new ArrayList<>();
        System.out.println("Set 1 :");
        for (int i = 0; i < set1.length; i++) {
            set1[i] = scan.nextInt();
        }
        System.out.println("Set 2 :");
        for (int i = 0; i < set2.length; i++) {
            set2[i] = scan.nextInt();
        }
        for (int i = 0; i < set1.length; i++) {
            for (int j = 0; j < set2.length; j++) {
                if(set1[i]==set2[j])
                {
                    intersection.add(set1[i]);
                }
            }
        }
        System.out.println("The intersection of the two sets : "+intersection.toString());
    }
}
