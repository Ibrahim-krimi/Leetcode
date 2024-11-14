package com.example.demo.Exercices;

import java.util.Timer;

public class SimulationLumiere {

    public void Simulation(Integer nombreDeLumiere ,long t_on , long T_off , long totalSeconde) throws InterruptedException {

        for (long i = 0 ; i <totalSeconde ; i ++ ){
            System.out.println("Seconde  : " +  (i+1) );

                for (int j = 0; j < nombreDeLumiere ; j ++) {

                    System.out.print("Lumiere : " + (j+1) );

                    if ( (i + j)%(T_off+t_on)<t_on){
                        System.out.print(" : Allumée");
                        System.out.println(" ");

                    }
                    else {
                        System.out.print(" : Eteinte");
                        System.out.println(" ");

                    }
                }
            System.out.println("*****************************");

            Thread.sleep(1000);

        }
    }


}
