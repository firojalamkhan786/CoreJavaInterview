/**
 * 
 */
package com.ayser.hackerrank.basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

/**
 * @author Ayser
 *
 */
public class JavaDateExample {

	
	public static void main1(String[] args) {
		System.out.println("Java Date object Example:");
		Date date = new Date();
		date.setDate(1);
		date.setMonth(0);
		date.setYear(2019);
		System.out.println("Set Date: " +date);
		System.out.println(date.getDay());
		
		//08 05 2999
		//date.set
	}
	
	/*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Date  date = new Date(year,month-1,day);
        System.out.println("Date: " +date + "  year:" +date.getYear());
        int day1 = date.getDay();
        String dayname ="";
        switch(day1){
            case 0 : dayname ="SUNDAY";
                     break;
            case 1 : dayname ="MONDAY";
                     break;
            case 2 : dayname ="TUESDAY";
                     break;
            case 3 : dayname ="WEDNESDAY";
                     break;
            case 4 : dayname ="THURSDAY";
                     break;
            case 5 : dayname ="FRIDAY";
                     break;
            case 6 : dayname ="SATURDAY";
                    break;                                    
        }
        return dayname;
    }




    public static void main(String[] args) throws IOException {
       /* BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = JavaDateExample.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();*/
    	
    	 String res = JavaDateExample.findDay(8, 5, 2999);
    	 System.out.println(res);
    	 
    }
    
}
