package com.pandaism.euler;

/**
 * @author Pandaism
 * @date 5/6/2018 : 6:12 PM
 */
public class Main {

    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;
        int difference;

        for(int i = 1; i <= 100; i++) {
            sum1 = (int) (sum1 + Math.pow(i, 2));
            sum2 = sum2 + i;
        }

        difference = (int) (Math.pow(sum2, 2) - sum1);

        System.out.println(difference);
    }
}
