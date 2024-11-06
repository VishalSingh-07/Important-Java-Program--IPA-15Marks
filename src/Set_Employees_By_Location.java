/*
Group the employees by city

Input:
----------------
Employee |      City
---------------------
Arijit       Kolkata
Minaz        Mumbai
Rahul        Chennai
Rajesh       Kolkata
Sekhar       Chennai
Kasim        Chennai

Output:
----------------
Kolkata: Arijit,Rajesh
Mumbai: Minaz
Chennai: Rahul,Sekhar,Kasim
 */
import java.util.*;
public class Set_Employees_By_Location {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        HashMap<String,ArrayList<String>> hashMap=new HashMap<>();
        System.out.print("Number of Employee: ");
        int n = scan.nextInt();
        scan.nextLine();
        for(int i=0;i<n;i++){
            System.out.print((i+1)+"> Enter name: ");
            String name = scan.nextLine();
            System.out.print("Enter city: ");
            String city = scan.nextLine();

            // Check if the city already exists in the map
            if (!hashMap.containsKey(city)) {
                hashMap.put(city, new ArrayList<>()); // Create a new list if city doesn't exist
            }

            // Add the employee name to the corresponding city
            hashMap.get(city).add(name);
        }
        for(Map.Entry<String,ArrayList<String>> entry: hashMap.entrySet()){
            String employees = String.join(",", entry.getValue());
            System.out.println(entry.getKey()+": "+employees);
        }
        System.out.println();


    }
}
