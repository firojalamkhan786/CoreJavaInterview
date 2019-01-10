package com.ayser.hackerrank.basic;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class IfElse1 {



    private static final Scanner scanner = new Scanner(System.in);

    public void testIfElse(int num) {
    	System.out.println("Input number: " +num);
       
        if(num %2 != 0){
            System.out.println("Weird");
        }else{
            if(num >= 2 && num <= 5){
                System.out.println("Not Weird");
            }else if( num >= 6 && num <= 20){
                System.out.println("Wieird");
            }else{
                System.out.println("Not Wierd");
            }
        }
    
    }
    public static void readLineFromIn() {
    String strVal = getInput("Enter string value: "); // Direct as string
    Integer intVal = Integer.parseInt(getInput("Enter integer value: "));
    Double dblVal = Double.parseDouble(getInput("Enter double value: "));
    Float fltVal = Float.parseFloat(getInput("Enter float value: "));

    System.out.println("String value: " + strVal);
    System.out.println("Integer value: " + intVal);
    System.out.println("Double value: " + dblVal);
    System.out.println("Float value: " + fltVal);
}

// Special Function to read all user input
private static String getInput(String prompt){
  BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

  System.out.print(prompt);
  System.out.flush();

  try{
      return stdin.readLine();
  } catch (Exception e){
    return "Error: " + e.getMessage();
  }
}
    public static void main(String[] args) {
    	 // int N = scanner.nextInt();
         // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    	readLineFromIn();
    	
       /*   System.out.println("Scan Double: ");
          double nextDouble = scanner.nextDouble();
          System.out.println("Scan Next:");
          String next = "";//scanner.next();
          next +=scanner.nextLine();*/
       //   String nextLine = scanner.nextLine();
        /*  System.out.println("Scan Boolean: ");
          boolean nextBoolean = scanner.nextBoolean();
          System.out.println("Scan Byte: ");
          byte nextByte = scanner.nextByte();
          System.out.println("scan float: ");
          float nextFloat = scanner.nextFloat();
          
          scanner.close();
          System.out.println("nextDouble : " +nextDouble);
         // System.out.println("nextLine : " +nextLine); 
          System.out.println("nextBoolean : " +nextBoolean);
          System.out.println("nextByte : " +nextByte);
          System.out.println("nextFloat : " +nextFloat);*/
          
         // canner.next
       //   System.out.println("next : " +next);
    	System.out.println("Testing If Else");
    	IfElse1 obj  = new IfElse1();
    	obj.testIfElse(24);
    	obj.testIfElse(20);
    	obj.testIfElse(18);
    	obj.testIfElse(29);
    	obj.testIfElse(100);
    	
    }
}

