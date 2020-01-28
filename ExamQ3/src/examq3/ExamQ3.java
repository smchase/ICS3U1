package examq3;

import java.io.*;

public class ExamQ3
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] names = {"Pentium II", "Pentium III", "Pentium IV", "Lexmark Optra R+"};
        int[] prices = {800, 1200, 2500, 1681};
        int[] quantities = {0, 0, 0, 0};
        int[] totalCosts = {0, 0, 0, 0};
        
        while (true) {
            System.out.print("1. Enter Quantities\n2. Display Data\n3. Display Cheapest\n4. Display Total Costs (Sorted)\n5. Quit\nEnter a number: ");
            char choice = br.readLine().charAt(0);
            
            if (choice == '1') {
                for (int i = 0; i < 4; i++) {
                    System.out.printf("> # of %s: ", names[i]);
                    quantities[i] = Integer.parseInt(br.readLine());
                    totalCosts[i] = prices[i] * quantities[i];
                }
            }
            
            else if (choice == '2') {
                System.out.printf("> %-20s %-15s %-15s %-15s\n", "Description", "Price ($)", "Quantity", "Total Cost ($)");
                for (int i = 0; i < 4; i++) {
                    System.out.printf("> %-20s %-15s %-15s %-15s\n", names[i], prices[i], quantities[i], totalCosts[i]);
                }
            }
            
            else if (choice == '3') {
                int bestPrice = totalCosts[0], bestChoice = 0;
                for (int i = 1; i < 4; i++) {
                    if (totalCosts[i] < bestPrice) {
                        bestPrice = totalCosts[i];
                        bestChoice = i;
                    }
                }
                System.out.printf("> %-20s %-15s %-15s %-15s\n", "Description", "Price ($)", "Quantity", "Total Cost ($)");
                System.out.printf("> %-20s %-15s %-15s %-15s\n", names[bestChoice], prices[bestChoice], quantities[bestChoice], totalCosts[bestChoice]);
            }
            
            else if (choice == '4') {
                int[] sortedCosts = totalCosts.clone();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (sortedCosts[j+1] < sortedCosts[j]) {
                            int tempCost = sortedCosts[j];
                            sortedCosts[j] = sortedCosts[j+1];
                            sortedCosts[j+1] = tempCost;
                        }
                    }
                }
                for (int i = 0; i < 4; i++) {
                    System.out.printf("> %d. $%d\n", i+1, sortedCosts[i]);
                }
            }
            
            else if (choice == '5') {
                break;
            }
            
            else {
                System.out.println("> INVALID CHOICE");
            }
            
            System.out.println();
        }
    }    
}
