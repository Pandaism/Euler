package com.pandaism.euler;

/**
 * @author Pandaism
 * @date 5/10/2018 : 1:50 PM
 */
public class Main {

    public static void main(String[] args) {
        int size = 20;
        long[][] lattice = new long[size + 1][size + 1];

        for(int i = 0; i < lattice.length; i++) {
            for(int j = 0; j < lattice.length; j++) {
                if(i == 0 || j == 0) {
                    lattice[i][j] = 1;
                } else {
                    lattice[i][j] = lattice[i - 1][j] + lattice[i][j - 1];
                }
            }
        }

        System.out.println(lattice[20][20]);
    }
}
