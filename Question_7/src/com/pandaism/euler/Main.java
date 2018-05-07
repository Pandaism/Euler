package com.pandaism.euler;

import java.util.ArrayList;

/**
 * @author Pandaism
 * @date 5/6/2018 : 6:53 PM
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(2D);

        for(double i = 3; i < Double.MAX_VALUE; i += 2) {
            if(isPrime(i)) list.add(i);

            if(list.size() == 10001) break;
        }

        System.out.println(list.get(10000));
    }

    private static boolean isPrime(double num) {
        if(num % 2 == 0) return false;

        for(double i = 3; i * i <= num; i += 2) {
            if(num % i == 0) return false;
        }

        return true;
    }
}
