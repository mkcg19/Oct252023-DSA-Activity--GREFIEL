package searchingAlgorithm;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Enter the number of elements in the array: ");

            try {
                n = scanner.nextInt();
                if (n <= 0) {
                    System.out.println("Number of elements must be greater than 0.");
                } else {
                    validInput = true;
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a positive integer for the number of elements.\n");
                scanner.nextLine(); 
            }
        }

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            try {
                arr[i] = scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter integer values for the array elements.\n");
                scanner.nextLine(); 
                i--; 
            }
        }

        System.out.print("Enter the element to search for: ");
        int target = 0;

        try {
            target = scanner.nextInt();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer value to search for.\n");
            return;
        }

        int index = linearSearch(arr, target);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; //element found, return its index
            }
        }
        return -1; //element not found
    }
}
