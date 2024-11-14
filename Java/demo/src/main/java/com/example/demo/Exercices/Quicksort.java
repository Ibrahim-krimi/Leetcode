package com.example.demo.Exercices;

import java.util.ArrayList;
import java.util.Collections;

public class Quicksort {

    public ArrayList<Integer> quicksort(ArrayList<Integer> arr, int left, int right) {

        if (left < right){
            int pivot = partition(arr, left, right);
            quicksort(arr, left, pivot - 1);
            quicksort(arr, pivot + 1, left);
        }
        return arr;
    }

    private int partition(ArrayList<Integer> arr, int left, int right) {
       int pivot = arr.get(right);
       int last = left - 1;
       for (int i = left ; i < right ; i++){
            if (arr.get(i) < pivot){
                last++;
                Collections.swap(arr, last, i);
            }
       }
       Collections.swap(arr , last+1,right);
       return  last+1;
    }

}
