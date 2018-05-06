package com.pandaism.euler;

/**
 * @author Pandaism
 * @date 5/6/2018 : 5:26 PM
 */
public class Main {

    public static void main(String[] args) {
        int result = 0;

        for(int i = 100; i < 1000; i++) {
            for(int j = 100; j < 1000; j++) {
                int product = i * j;

                if (isPalindrome(product)) {
                    if(result < product) {
                        result = product;
                    }
                }
            }
        }

        System.out.println(result);
    }

    private static boolean isPalindrome(int num) {
        StringBuilder sb = new StringBuilder(String.valueOf(num));

        return sb.toString().equals(sb.reverse().toString());
    }
}
