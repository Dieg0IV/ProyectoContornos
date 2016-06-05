/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bingohit;

/**
 *
 * @author Diego IV
 */
public class BingoHit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int i, j, t, z, rnd, min = 0, max = 99;
        int[][] tabla;
        tabla = new int[10][10];
        
        rnd = min + (int) (Math.random() * max);

        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                tabla[i][j] = rnd;
                System.out.println(tabla[i][j]);
            }
        }

    }

}
