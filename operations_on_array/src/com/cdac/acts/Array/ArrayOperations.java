package com.cdac.acts.Array;

/* Day 1: creation of array, adding to array, insertion into array, deletion from array */
public class ArrayOperations {
    public static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

    public static int[] resizeArray(int[] arr, int newSize) {
        // Create larger array
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
        int[] nos = new int[2];
        int count = 0;

        nos[0] = 5;
        count++;
        nos[1] = 10;
        count++;

        System.out.print("Array Elements Are: ");
        printArray(nos, count);

        System.out.println("\nBefore resize, nos size is: " + nos.length);
        nos = resizeArray(nos, 5);
        System.out.println("After resize, nos size is: " + nos.length);

        System.out.print("\nBefore insert, array elements are: ");
        printArray(nos, count);
        count = insertInArray(nos, count, 1, 115);
        System.out.print("After insert, array elements are: ");
        printArray(nos, count);

        System.out.print("\nBefore delete, array elements are: ");
        printArray(nos, count);
        count = deleteFromArray(nos, count, 0);
        System.out.print("After delete, array elements are: ");
        printArray(nos, count);
    }
}
