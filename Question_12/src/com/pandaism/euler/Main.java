package com.pandaism.euler;

/**
 * @author Pandaism
 * @date 5/9/2018 : 1:51 PM
 *
 * CODE IS NOT EFFICIENT REDO
 * @date 5/9/2018 : 6:05 PM
 */
public class Main {

    public static void main(String[] args) {
        for(long l = 1; l < Long.MAX_VALUE; l++) {
            long tri = triangleNum(l);

            long size = divisorSize(tri);
            if (size > 500) {
                System.out.println("Answer: " + tri);
                break;
            } else {
                System.out.println(tri);
            }

        }
    }

    private static int divisorSize(long num) {
        int size = 0;
        for (long i = 1; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                size++;
            }
        }
        return size * 2;
    }

    private static long triangleNum(long num) {
        return (num * (num + 1)) / 2;
    }
}
