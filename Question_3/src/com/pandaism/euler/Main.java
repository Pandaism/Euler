package com.pandaism.euler;

/**
 * @author Pandaism
 * @date 5/6/2018 : 3:32 PM
 */
public class Main {
    public static void main(String[] args) {
        double num = 600851475143D;
        double largestPrime = 0;

        for(double i = 2; i <= num; i++) {
            if(num % i == 0) {
                num = num / i;
                if(isPrime(i)) {
                    largestPrime = i;
                }
                i = 2;
            }
        }

        System.out.println(largestPrime);
    }

    private static boolean isPrime(double i) {
        if(i % 2 == 0) {
            return false;
        }

        for(double j = 3; j * j <= i; j+= 2) {
            if(i % j == 0) {
                return false;
            }
        }

        return true;
    }
}
