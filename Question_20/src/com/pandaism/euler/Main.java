package com.pandaism.euler;

import java.math.BigInteger;

/**
 * @author Pandaism
 * @date 5/11/2018 : 1:49 PM
 */
public class Main {
    public static void main(String[] args) {
        BigInteger factorial = factorial(new BigInteger("100"));
        String[] num = factorial.toString().split("");
        int sum = 0;

        for(String s : num) {
            sum += Integer.parseInt(s);
        }

        System.out.println(sum);
    }

    private static BigInteger factorial(BigInteger num) {
        if(num.equals(BigInteger.ONE)) {
            return BigInteger.ONE;
        }

        return num.multiply(factorial(num.subtract(BigInteger.ONE)));
    }
}
