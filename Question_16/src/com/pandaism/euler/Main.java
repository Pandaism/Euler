package com.pandaism.euler;

import java.math.BigDecimal;

/**
 * @author Pandaism
 * @date 5/10/2018 : 2:12 PM
 */
public class Main {

    public static void main(String[] args) {
        int exponent = 1000;
        BigDecimal answer = new BigDecimal(Math.pow(2, exponent));
        String[] split = answer.toPlainString().split("");
        long result = 0;

        for(String s : split) {
            result = result + Integer.parseInt(s);
        }

        System.out.println(result);
    }
}
