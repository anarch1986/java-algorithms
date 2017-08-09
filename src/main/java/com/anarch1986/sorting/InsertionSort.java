package com.anarch1986.sorting;

public class InsertionSort {

    public void sort(int[] intArray) {

        if (intArray ==null || intArray.length==0){
            return;
        }

        for (int i = 1; i < intArray.length; i++) {
            int j = i;
            while (j > 0 && intArray[j - 1] > intArray[j]) {
                int m = intArray[j];
                int n = intArray[j - 1];
                intArray[j] = n;
                intArray[j - 1] = m;
                j = j - 1;
            }
        }
    }
}
