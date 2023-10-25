package searchingAlgorithm;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        while (true) {
            try {
                System.out.print("Enter the number of elements in the array: ");
                n = scanner.nextInt();
                break; 
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.\n");
                scanner.nextLine(); 
            }
        }

        int[] arr = new int[n];

        System.out.println("Enter the sorted elements of the array:");

        for (int i = 0; i < n; i++) {
            while (true) {
                try {
                    System.out.print("Element " + (i + 1) + ": ");
                    arr[i] = scanner.nextInt();
                    break; 
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid integer.\n");
                    scanner.nextLine(); 
                }
            }
        }

        System.out.print("Enter the number you want to search for: ");
        int target = 0;

        while (true) {
            try {
                target = scanner.nextInt();
                break; 
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.\ns");
                scanner.nextLine(); 
            }
        }

        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("The element is not in the array.");
        } else {
            System.out.println("The element is at index: " + result);
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; 
    }

}
