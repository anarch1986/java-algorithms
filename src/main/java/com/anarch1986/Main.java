package com.anarch1986;

import com.anarch1986.sorting.BubbleSort;
import com.anarch1986.sorting.MergeSort;
import com.anarch1986.sorting.QuickSort;
import com.anarch1986.sorting.SelectionSort;

public class Main {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();
        MergeSort mergeSort = new MergeSort();
        QuickSort quickSort = new QuickSort();

        int[] intArray = new int[]{5,90,3,5,35,45,150,45,3};

        System.out.println("Array Before Bubble Sort:");
        for(int i=0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }

        bubbleSort.sort(intArray);

        System.out.println("");
        System.out.println("");

        System.out.println("Array After Bubble Sort:");
        for(int i=0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }

        System.out.println("");
        System.out.println("");

        intArray = new int[]{5,90,3,5,35,45,150,45,3};

        System.out.println("Array Before Selection Sort:");
        for(int i=0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }

        selectionSort.sort(intArray);

        System.out.println("");
        System.out.println("");

        System.out.println("Array After Selection Sort:");
        for(int i=0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }

        System.out.println("");
        System.out.println("");

        intArray = new int[]{5,90,3,5,35,45,150,45,3};

        System.out.println("Array Before Merge Sort:");
        for(int i=0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }

        mergeSort.sort(intArray);

        System.out.println("");
        System.out.println("");

        System.out.println("Array After Merge Sort:");
        for(int i=0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }

        System.out.println("");
        System.out.println("");

        intArray = new int[]{5,90,3,5,35,45,150,45,3};

        System.out.println("Array Before Quick Sort:");
        for(int i=0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }

        quickSort.sort(intArray);

        System.out.println("");
        System.out.println("");

        System.out.println("Array After Quick Sort:");
        for(int i=0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }
    }
}
