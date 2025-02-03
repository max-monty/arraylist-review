import java.util.ArrayList;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        // Basic ArrayList operations demo
        System.out.println("ArrayList Demo\n");
        arrayListBasics();
        
        // Common pitfalls and solutions
        System.out.println("\nCommon Pitfalls Demo\n");
        arrayListPitfalls();
    }

    private static void arrayListBasics() {
        ArrayList<String> fruits = new ArrayList<>();
        
        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        
        // Accessing elements
        System.out.println("First fruit: " + fruits.get(0));
        
        // Iterating - different approaches
        // 1. Enhanced for loop (preferred for readability)
        System.out.println("\nUsing enhanced for loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        // 2. Traditional for loop (when index is needed)
        System.out.println("\nUsing traditional for loop:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("Index " + i + ": " + fruits.get(i));
        }
    }

    private static void arrayListPitfalls() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        
        // Demonstrating proper bounds checking
        if (numbers.size() > 1) {
            System.out.println(numbers.get(1));
        } else {
            System.out.println("Index 1 is out of bounds! Current size: " + numbers.size());
        }
        
        // Remove elements (using basic ArrayList methods)
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("\nOriginal list: " + list);
        
        // Remove even numbers using a backward loop
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }
        System.out.println("After removing evens: " + list);
        
        // Remove odds going forward
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 1) {
                list.remove(i);
                i--;
            }
        }

        // Removing in a for each loop doesn't work because the list is changing size
        // This will throw a ConcurrentModificationException
        // System.out.println("\nRemoving in a for each loop");
        // list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        // for (Integer num : list) {
        //     if (num % 2 == 1) {
        //         list.remove(num);
        //     }
        // }

        System.out.println("After removing odds: " + list);
        // Removing in a while loop
        System.out.println("\nRemoving in a while loop");
        list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) % 2 == 1) {
                list.remove(i);
            } else {
                i++;
            }
        }
        System.out.println("After removing odds: " + list);

    }
}
