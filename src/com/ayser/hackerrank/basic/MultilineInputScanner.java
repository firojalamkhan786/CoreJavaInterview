/**
 * 
 */
package com.ayser.hackerrank.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Ayser
 *
 */
public class MultilineInputScanner {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        List<String> inputList = new ArrayList<String>();
        do{
            String str = scanner.nextLine();
            inputList.add(str);
        }while(scanner.hasNextLine());
        scanner.close();
        for(int i =0 ; i< inputList.size(); i++){
            System.out.println((i+1)+ " " +inputList.get(i));
        }
    }
}
