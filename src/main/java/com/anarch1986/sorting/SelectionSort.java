package com.anarch1986.sorting;

public class SelectionSort {

    public void sort(int[] intArray) {

        if (intArray ==null || intArray.length==0){
            return;
        }

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < (intArray.length); j++) {
                if (intArray[j] > intArray[i]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[i];
                    intArray[i] = temp;
                }
            }
        }
    }
}
