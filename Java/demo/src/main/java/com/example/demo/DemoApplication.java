package com.example.demo;

import com.example.demo.Exercices.Quicksort;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collections;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        Quicksort sorter = new Quicksort();
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 10, 7, 8, 9, 1, 5);

        System.out.println("Tableau non trié : " + arr);
        sorter.quicksort(arr, 0, arr.size() - 1);
        System.out.println("Tableau trié : " + arr);

        SpringApplication.run(DemoApplication.class, args);
    }

}
