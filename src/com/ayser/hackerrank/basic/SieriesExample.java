package com.ayser.hackerrank.basic;

import java.util.Scanner;

/**
 * We use the integers , , and  to create the following series:

You are given  queries in the form of , , and . For each query, print the series corresponding to the given , , and  values as a single line of  space-separated integers.

Input Format

The first line contains an integer, , denoting the number of queries. 
Each line  of the  subsequent lines contains three space-separated integers describing the respective , , and  values for that query.

Constraints

Output Format

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of  space-separated integers.

Sample Input

2
0 2 10
5 3 5
Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
Explanation

We have two queries:

We use , , and  to produce some series :

... and so on.

Once we hit , we print the first ten terms as a single line of space-separated integers.

We use , , and  to produce some series :

We then print each element of our series as a single line of space-separated values
 * @author Ayser
 *
 */
public class SieriesExample {

	
	public static int twoPowerN(int powerN){
        int num =1;
        if(powerN ==0){
            num =1;
        }else {
            for(int i=0; i<powerN; i++){
                num = num*2;
            }
        }
       return num;
    }
	
	public static void main1(String[] args) {
		
		int n =10;
		for(int i=0; i<n; i++) {
			int num = twoPowerN(i);
			System.out.println(num +" ");
		}
	}
	
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum =a;
            for(int j=0; j<n; j++){
                sum +=  (twoPowerN(j)*b ); 
                System.out.print(sum +" "); 
            }
            System.out.println();
        }
        in.close();
    }

    /*public static int twoPowerN(int powerN){
        int num =1;
        if(powerN ==0){
            num =1;
        }else {
            for(int i=0; i<powerN; i++){
                num = num*2;
            }
        }
       return num;
    }*/
}
