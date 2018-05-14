package com.pandaism.euler;

/**
 * @author Pandaism
 * @date 5/12/2018 : 5:43 PM
 */
public class Main {
    public static void main(String[] args) {
        String digits = "0123456789";
        int limit = 999_999;

        StringBuilder sb = new StringBuilder();

        while(digits.length() > 1) {
            int j = limit / getAmountOfPermutations(digits.length() - 1);
            limit %= getAmountOfPermutations(digits.length() - 1);
            sb.append(digits.charAt(j));
            digits = remove(digits, j);
        }

        sb.append(digits);
        System.out.printf("Answer: %s", sb );
    }

    private static String remove(String string, int index) {
        char[] chars = string.toCharArray();
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < chars.length; i++) {
            if(i != index) {
                s.append(chars[i]);
            }
        }

        return s.toString();
    }

    private static int getAmountOfPermutations(int permutationLength) {
        if(permutationLength == 1) {
            return 1;
        }

        return permutationLength * getAmountOfPermutations(permutationLength - 1);
    }
}
