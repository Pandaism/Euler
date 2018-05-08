package com.pandaism.euler;

/**
 * @author Pandaism
 * @date 5/7/2018 : 7:55 PM
 */
public class Main {

    public static void main(String[] args) {

        int limit = 2000000;
        long total = 0;
        for(int i = 2; i < limit; i++) {
            if(isPrime(i)) {
                total = total + i;
            }
        }

        System.out.println(total);
    }

    private static boolean isPrime(int num) {
        if(num == 2) return true;
        if(num % 2 == 0) return false;

        for(int i = 3; Math.pow(i, 2) <= num; i++) {
            if(num % i == 0) return false;
        }

        return true;
    }
}
