package com.ayser.hackerrank.basic;

import java.util.Scanner;

public class StaticInitializerExample {

	 public static boolean flag = false;
	    public static int B;
	    public static int H;

	    static{
	        Scanner scanner = new Scanner(System.in);
	        B = scanner.nextInt();
	        H = scanner.nextInt();
	        if( B<=0 || H <=0){
	            System.out.println("java.lang.Exception: Breadth and height must be positive");
	          // throw new Exception("Breadth and height must be positive");
	        }
	        else if(B>0 && H >0){
	            flag =true;
	        }
	    }
	public static void main(String[] args){
			if(flag){
				int area=B*H;
				System.out.print(area);
			}
			//String.valueOf
		}//end of main
}
