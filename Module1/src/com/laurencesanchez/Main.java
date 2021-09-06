package com.laurencesanchez;

public class Main {

    public static void main(String[] args) {
	int[] numbers = new int[10];

    numbers[0] = 252;
    numbers[1] = 77;
    numbers[2] = 48;
    numbers[3] = 223;
    numbers[4] = 88;
    numbers[5] = -129;
    numbers[6] = 182;
    numbers[7] = 7;
    numbers[8] = 145;
    numbers[9] = 97;

    System.out.println("Before Selection Sort: ");
    printArrayElements(numbers);

    System.out.println("\n\nAfter Selection Sort: ");
    selectionSort(numbers);
    printArrayElements(numbers);
    }

    private static void selectionSort(int[] arr)
    {
        for(int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int smallestIndex = lastSortedIndex;
            for(int i = 1; i <= lastSortedIndex; i++)
            {
                if(arr[i] < arr[smallestIndex])
                {
                    smallestIndex = i;
                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
    }

    private static void bubbleSort(int[] arr)
    {
        for(int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for(int i = 0; i < lastSortedIndex; i++)
            {
                if(arr[i] < arr[i + 1])
                {
                    int temp = arr[i];
                    arr [i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    private static void printArrayElements(int[] arr)
    {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
