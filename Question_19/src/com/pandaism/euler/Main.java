package com.pandaism.euler;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Pandaism
 * @date 5/11/2018 : 10:52 AM
 */
public class Main {
    public static void main(String[] args) {
        int startYear = 1901;
        int endYear = 2000;
        int result = 0;

        for(int i = startYear; i <= endYear; i++) {
            for(int j = 0; j <= 11; j++) {
                if(new GregorianCalendar(i, j, 1).get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                    result++;
                }

            }
        }

        System.out.println(result);
    }
}
