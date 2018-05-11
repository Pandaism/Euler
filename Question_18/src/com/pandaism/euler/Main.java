package com.pandaism.euler;

/**
 * @author Pandaism
 * @date 5/10/2018 : 11:29 PM
 */
public class Main {
    public static void main(String[] args) {
        String triangle ="75\n" +
                "95 64\n" +
                "17 47 82\n" +
                "18 35 87 10\n" +
                "20 04 82 47 65\n" +
                "19 01 23 75 03 34\n" +
                "88 02 77 73 07 63 67\n" +
                "99 65 04 28 06 16 70 92\n" +
                "41 41 26 56 83 40 80 70 33\n" +
                "41 48 72 33 47 32 37 16 94 29\n" +
                "53 71 44 65 25 43 91 52 97 51 14\n" +
                "70 11 33 28 77 73 17 78 39 68 17 57\n" +
                "91 71 52 38 17 14 91 43 58 50 27 29 48\n" +
                "63 66 04 68 89 53 67 30 73 16 69 87 40 31\n" +
                "04 62 98 27 23 09 70 98 73 93 38 53 60 04 23";
        String[] triangleArray = populateArray(triangle);
        int[][] matrix = triToSquareMatrix(triangleArray);
        int result = 0;

        for(int i = matrix.length - 1; i >= 0; i--) {
            for(int j = 0; j < matrix[i].length; j++) {
                int aIndex = matrix[i][j];
                int bIndex = 0;
                int checkIndex = 0;
                if(j + 1 < matrix[i].length) {
                    bIndex = matrix[i][j + 1];
                }
                if(i - 1 >= 0) {
                    checkIndex = matrix[i - 1][j];

                    if(aIndex + checkIndex > bIndex + checkIndex) {
                        matrix[i - 1][j] =  aIndex + checkIndex;
                    } else {
                        matrix[i - 1][j] = bIndex + checkIndex;
                    }
                }
            }
        }

        for(int i = 0; i < matrix[0].length; i++) {
            if(matrix[0][i] > result) {
                result = matrix[0][i];
            }
        }

        System.out.println(result);
    }

    private static int[][] triToSquareMatrix(String[] triangleArray) {
        int[][] matrix = new int[triangleArray.length][triangleArray.length];

        for(int i = 0; i < triangleArray.length; i++) {
            String[] array = triangleArray[i].split(" ");
            for(int j = 0; j < array.length; j++) {
                matrix[i][j] = Integer.parseInt(array[j]);
            }
        }

        return matrix;
    }

    private static String[] populateArray(String triangle) {
        String[] triangleArray = triangle.split("\n");

        for(int i = 0; i < triangleArray.length; i++) {
            while (triangleArray[i].split(" ").length != triangleArray.length) {
                triangleArray[i] += " 0";
            }
        }

        return triangleArray;
    }
}
