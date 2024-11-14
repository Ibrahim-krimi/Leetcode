package com.example.demo;

import com.example.demo.Exercices.CarreParfait;
import com.example.demo.Exercices.Palindrome;
import com.example.demo.Exercices.Quicksort;
import com.example.demo.Exercices.SimulationLumiere;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Collections;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) throws InterruptedException {

        // exo 1

/*        Quicksort sorter = new Quicksort();
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 10, 7, 8, 9, 1, 5);

        System.out.println("Tableau non trié : " + arr);
        sorter.quicksort(arr, 0, arr.size() - 1);
        System.out.println("Tableau trié : " + arr);

 */
        // exo 2
       // SimulationLumiere simulationLumiere = new SimulationLumiere();

        //simulationLumiere.Simulation(10,4,2,20);

        //exo3
       /*
        CarreParfait carreParfait = new CarreParfait();
        carreParfait.carreParfait(16);
        carreParfait.carreParfait(14);
        //carreParfait.carreParfait(20);
        //carreParfait.carreParfait(64);
        //carreParfait.carreParfait(91);
        carreParfait.carreParfait(100);
        carreParfait.carreParfait(101);
        int x = 16;

        if (carreParfait.carreParfait2(x, 1, x)) {
            System.out.println(x + " est un carré parfait.");
        } else {
            System.out.println(x + " n'est pas un carré parfait.");
        }

        */

        // exo 4
        Palindrome palindrome = new Palindrome();

        System.out.println("radar : " + palindrome.isPalindrome("radar"));
        System.out.println("hello : " + palindrome.isPalindrome("hello"));

        SpringApplication.run(DemoApplication.class, args);
    }

}
