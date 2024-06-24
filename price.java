import java.util.*;
import java.util.Arrays;

class Store { //class name
    public double pricesofitems[] = {2.99, 3.21, 3.33, 1.55, 4.22};
    public double prices[] = new double[5];
    public int quantity[] = new int[5];
    public String items1[] = {"orange", "mango", "pineapple", "apple", "grape"};
    public String items[] = new String[5];

    Store(int quantity[], String items[]) {
        this.items = items;
        this.quantity = quantity;
    } //end of constructor

    public void arrangefruits() {
    // Make a copy of items to sort
    String[] sortedItems = Arrays.copyOf(items, items.length);
    Arrays.sort(sortedItems); // Sort the copy

    for (int i = 0; i < items.length; i++) {
        // Check if items[i] is different from items1[i]
        if (!items[i].equalsIgnoreCase(items1[i])) {
            String targetItem = items1[i].toLowerCase(); // Target item from items1
            items[i] = targetItem; // Update items[i] to match items1[i] case insensitively

            // Find index of updated item in sortedItems
            int index = Arrays.binarySearch(sortedItems, targetItem);

            if (index >= 0) {
                quantity[i] = quantity[index]; // Update quantity based on index in sortedItems
            } else {
                System.out.println("Invalid entry. Item not found: " + items[i]);
                // Handle case where item not found (should not happen if items1 and items are aligned properly)
            }
        }
    }
}

    public void calculateTotalPrice() {

        double sum = 0.0;

        for(int i = 0; i < items.length; i++) {
            items[i] = items[i].toLowerCase();

            switch(items[i]) {
            case "orange":
            case "mango":
            case "pineapple":
            case "apple":
            case "grape": {
                prices[i] = quantity[i] * pricesofitems[i];
            }
            break;

            default: {
                System.out.println("Invaid entry. Try again.");
                i--;
            }
            break;
            }

            sum+= prices[i]; 
        }

        System.out.println("Total Price: $" + sum); 
    }

    public void countItemsAbovePrice() {
        int threshold = 0;

        for(int i = 0; i < items.length; i++) {
            if(prices[i] > 10.00) {
                threshold++;
            }
        }

        System.out.println("Number of items above $10.00: " + threshold);

    } //end of method

} //end of "Store" class

public class price //class name
{ 
    public static void main(String[] args) throws InterruptedException 
    {
        Scanner input = new Scanner(System.in); //calling the Scanner Class

        int num = 5;
        int option; 
        String items1[] = {"orange", "mango", "pineapple", "apple", "grape"};

        String items[] = new String[num];
        int quantity[] = new int[num];

        System.out.println("Enter the name of the products below, one by one");

        for(int i = 0; i < num; i++) 
        {
            items[i] = input.nextLine();
        }
    
        
        System.out.println();
        System.out.println("Enter the number of items purchased for the following: ");

        for(int i = 0; i < num; i++) 
        {
            System.out.print(items[i].substring(0,1).toUpperCase() + items[i].substring(1) + ": ");
            quantity[i] = input.nextInt();
        }

        System.out.println();
        Thread.sleep(3000);

        Store store = new Store(quantity, items);

        store.arrangefruits();
        store.calculateTotalPrice();
        store.countItemsAbovePrice();

        input.close(); //closes the Scanner

        System.exit(0); //exits the program

    } //end of main

} //end of "price" class