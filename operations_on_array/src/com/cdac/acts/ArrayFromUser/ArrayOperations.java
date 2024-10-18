package com.cdac.acts.ArrayFromUser;

import java.util.Scanner;

public class ArrayOperations {
    public static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static int[] resizeArray(int[] arr, int newSize) {
        int[] newArray = new int[newSize];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        return newArray;
    }

    public static int insertInArray(int[] arr, int n, int position, int value) {
        for (int i = n; i > position; i--) {
            arr[i] = arr[i - 1];
        }
        arr[position] = value;
        return n + 1;
    }

    public static int deleteFromArray(int[] arr, int n, int position) {
        for (int i = position; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        return n - 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter initial array size: ");
        int initialSize = scanner.nextInt();
        int[] nos = new int[initialSize];
        int count = 0;

        // Adding elements
        for (int i = 0; i < initialSize; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            nos[i] = scanner.nextInt();
            count++;
        }
        
        System.out.print("Array Elements Are: ");
        printArray(nos, count);

        // Resizing array
        System.out.print("\nEnter new array size: ");
        int newSize = scanner.nextInt();
        nos = resizeArray(nos, newSize);
        System.out.println("After resize, nos size is: " + nos.length);

        // Inserting element
        System.out.print("\nEnter position to insert element: ");
        int position = scanner.nextInt();
        System.out.print("Enter value to insert: ");
        int value = scanner.nextInt();
        count = insertInArray(nos, count, position, value);
        System.out.print("After insert, array elements are: ");
        printArray(nos, count);

        // Deleting element
        System.out.print("\nEnter position to delete element: ");
        int deletePosition = scanner.nextInt();
        count = deleteFromArray(nos, count, deletePosition);
        System.out.print("After delete, array elements are: ");
        printArray(nos, count);
        
        scanner.close();
    }
}
