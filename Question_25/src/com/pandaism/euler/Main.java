package com.pandaism.euler;

import java.math.BigInteger;

/**
 * @author Pandaism
 * @date 5/12/2018 : 8:55 PM
 */
public class Main {

    public static void main(String[] args) {
        BigInteger a;
        BigInteger b = new BigInteger("89");
        BigInteger sum = new BigInteger("144");
        int i = 12;
        while(sum.toString().length() < 1000) {
            a = b;
            b = sum;
            sum = a.add(b);
            i++;
        }
        System.out.println(i);
    }
}
