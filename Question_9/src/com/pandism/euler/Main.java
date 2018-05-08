package com.pandism.euler;

/**
 * @author Pandaism
 * @date 5/7/2018 : 7:07 PM
 */
public class Main {

    public static void main(String[] args) {
        int total = 1000;

        for(int a = 1; a <= total; a++) {
            for(int b = a + 1; b <= total; b++) {
                int c = total - a - b;

                if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                    System.out.println(a * b * c);
                }
            }
        }
    }
}
