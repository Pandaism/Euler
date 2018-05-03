package com.pandaism.euler;

/**
 * @author Pandaism
 * @date 5/3/2018 : 8:56 AM
 */
public class Main {

    public static void main(String[] args) {
        int multipler_1 = 3;
        int multipler_2 = 5;
        int total = 0;
        for(int i = 0; i < 1000; i++) {
            if(i % multipler_1 == 0 || i % multipler_2 == 0) {
                total = total + i;
            }
        }

        System.out.println(total);
    }
}
