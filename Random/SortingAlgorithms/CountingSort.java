package org.example;

public class CountingSort {

    // Big-O runtime is O(n + k)

    public static void countingSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        // Find the range of the input
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Calculate the range
        int range = max - min + 1;

        // Create a count array to store the count of each unique object
        int[] count = new int[range];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - min]++;
        }

        // Modify the count array such that each element at each index
        // stores the sum of previous counts
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        int[] output = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        // Copy the sorted elements back to the original array
        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    // This function is not needed. Just used for printing.
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    
    public static void main(String args[]) {
        int arr[] = {38, 27, 499, 43, 3, 9, 82, 500, 10, 44, 103, 443, 431, 219, 356};
        System.out.println("Given Array");
        printArray(arr);

        countingSort(arr);

        System.out.println("\nSorted array");
        printArray(arr);
    }
}