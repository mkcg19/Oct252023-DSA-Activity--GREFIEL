package searchingAlgorithm;

import java.util.HashMap;
import java.util.Scanner;

public class HashTable {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String>[] hashTable = new HashMap[10];

        for (int i = 0; i < 10; i++) {
            hashTable[i] = new HashMap<>();
        }

        while (true) {
            try {
                System.out.print("Enter a key (or -1 to exit): ");
                int key = scanner.nextInt();

                if (key == -1) {
                    break;
                }

                System.out.print("Enter a value: ");
                String value = scanner.next();

                if (value.matches("^[a-zA-Z]*$")) {
                    int index = key % 10; 
                    hashTable[index].put(key, value);
                } else {
                    System.out.println("Invalid input. Please enter a valid string value.\n");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer key.\n");
                scanner.nextLine(); 
            }
        }

        System.out.println("Hash Table Contents:");

        for (int i = 0; i < 10; i++) {
            System.out.println("Index " + i + ": " + hashTable[i]);
        }
    }

}
