package com.pandaism.euler;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author Pandaism
 * @date 5/10/2018 : 10:24 PM
 */
public class Main {
    public static void main(String[] args) {
        Map<Integer, String> oneToNineteen = getOneToNineteen();
        Map<Integer, String> tensPlace = getTensPlace();

        int total = 0;

        for(int i = 1; i <= 999; i++) {
            StringBuilder sb = new StringBuilder();

            if(i <= 19) {
                total += oneToNineteen.get(i).length();
            } else {
                char[] numArray = String.valueOf(i).toCharArray();
                Integer hundred = 0;
                String hundredString = " ";

                if(numArray.length == 3) {
                    hundred = Integer.parseInt(String.valueOf(numArray[numArray.length - 3]));
                    hundredString = " hundred ";
                }

                Integer tens = Integer.parseInt(String.valueOf(numArray[numArray.length - 2]));
                Integer ones = Integer.parseInt(String.valueOf(numArray[numArray.length - 1]));

                if(!hundredString.equals(" ")) {
                    if(tens != 0 || ones != 0) hundredString += "and ";
                }

                if(tens == 1) {
                    sb.append(oneToNineteen.get(hundred) + hundredString + oneToNineteen.get(tens * 10 + ones));
                } else {
                    sb.append(oneToNineteen.get(hundred) + hundredString + tensPlace.get(tens) + " " + oneToNineteen.get(ones));
                }
            }

            total += sb.toString().replaceAll(" ", "").length();
        }

        System.out.println(total + "onethousand".length());
    }

    private static Map<Integer, String> getTensPlace() {
        Map<Integer, String> name = new TreeMap<>();
        name.put(0, "");
        name.put(2, "twenty");
        name.put(3, "thirty");
        name.put(4, "forty");
        name.put(5, "fifty");
        name.put(6, "sixty");
        name.put(7, "seventy");
        name.put(8, "eighty");
        name.put(9, "ninety");

        return name;
    }

    private static Map<Integer, String> getOneToNineteen() {
        Map<Integer, String> name = new TreeMap<>();
        name.put(0, "");
        name.put(1, "one");
        name.put(2, "two");
        name.put(3, "three");
        name.put(4, "four");
        name.put(5, "five");
        name.put(6, "six");
        name.put(7, "seven");
        name.put(8, "eight");
        name.put(9, "nine");
        name.put(10, "ten");
        name.put(11, "eleven");
        name.put(12, "twelve");
        name.put(13, "thirteen");
        name.put(14, "fourteen");
        name.put(15, "fifteen");
        name.put(16, "sixteen");
        name.put(17, "seventeen");
        name.put(18, "eighteen");
        name.put(19, "nineteen");

        return name;
    }
}
