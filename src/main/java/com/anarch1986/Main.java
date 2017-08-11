package com.anarch1986;

import com.anarch1986.numbers.Fibonacci;
import com.anarch1986.numbers.Sieve;
import com.anarch1986.sorting.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        SelectionSort selectionSort = new SelectionSort();
        InsertionSort insertionSort = new InsertionSort();
        MergeSort mergeSort = new MergeSort();
        QuickSort quickSort = new QuickSort();
        Sieve sieve = new Sieve();
        Fibonacci fibonacci = new Fibonacci();

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

        System.out.println("Array Before Insertion Sort:");
        for(int i=0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }

        insertionSort.sort(intArray);

        System.out.println("");
        System.out.println("");

        System.out.println("Array After Insertion Sort:");
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

        System.out.println("");
        System.out.println("");

        Boolean[] primes = sieve.findPrimes(100);
        ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
        for (int i = 0;i<primes.length;i++) {
         if (primes[i]) {
             primeNumbers.add(i);
         }
        }
        System.out.println("Prime numbers until 100:");
        System.out.println(primeNumbers);

        System.out.println("");
        System.out.println("");
        System.out.println("The first 15 fibonacci numbers:");
        System.out.println(fibonacci.getFibonacciNumbers(16));
    }
}
