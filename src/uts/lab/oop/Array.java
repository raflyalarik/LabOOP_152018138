/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.lab.oop;

/**
 *
 * @author Dell
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] deret = {1, 2, 3, 4, 5, 6, 7, 8 , 9, 10};

        System.out.println("Panjang array deret: "+deret.length);

        for (int i = 0; i < deret.length; i++){
            System.out.println("elemen ke - "+deret[i]);
        }   

        double[] Berat = new double[5];
        Berat[0] = 70.7;
        Berat[1] = 64.4;
        Berat[2] = 55.1;
        Berat[3] = 81.0;
        Berat[4] = 60.5;

        System.out.println("Panjang array Berat: "+Berat.length);

        for (int i = 0; i < Berat.length; i++){
            System.out.println("elemen ke - "+Berat[i]);
        
    }
}
        // TODO code application logic here
    }
    

    