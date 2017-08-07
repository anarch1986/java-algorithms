package com.anarch1986.sorting;

public class BubbleSort {

    public void sort(int[] intArray) {

        if (intArray ==null || intArray.length==0){
            return;
        }

        for (int i = 0; i < intArray.length; i++) {
            for (int j = 1; j < (intArray.length - i); j++) {
                if (intArray[j - 1] > intArray[j]) {
                    int temp = intArray[j - 1];
                    intArray[j - 1] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
    }

    public void anotherSort(int[] intArray) {
        int j;
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (j = 0; j < intArray.length - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                    flag = true;
                }
            }
        }
    }
}
