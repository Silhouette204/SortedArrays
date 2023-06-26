
package machinelearning3;
import java.util.Arrays;
import java.util.Scanner;

public class MachineLearning3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = new String[10];
        
        // Input the 10 names from the user.
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the name number " + (i + 1) + ": ");
            names[i] = input.nextLine();
        }
        
        // input or sorted and display names
        Arrays.sort(names);
        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
        
        // ask the user to wants add more names
        while (true) {
            System.out.print("Do you want to add another name? (Y/N): ");
            String answer = input.nextLine().toLowerCase();
            
            if (answer.equals("y")) {
                System.out.print("Add name: ");
                String newName = input.nextLine();
                
                String[] newNames = Arrays.copyOf(names, names.length + 1);
                newNames[newNames.length - 1] = newName;
                names = newNames;
                
                // Updated sorted and display names
                Arrays.sort(names);
                System.out.println("Updated sorted names:");
                for (String name : names) {
                    System.out.println(name);
                }
            } else if (answer.equals("n")) {
                // Terminate the program
                System.out.println("Thank You!");
                break;
                          
            }
        }
        
    }
}
    

