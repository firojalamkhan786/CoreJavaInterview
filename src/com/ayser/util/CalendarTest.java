/**
 * 
 */
package com.ayser.util;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Ayser
 *
 */
public class CalendarTest {

	static String timeConversion(String s) {
        /*
         * Write your code here. 12:00:00AM
         */
		 String str[] = s.split(":");
	        String seconds = str[2].substring(0,2);
	        String amPm = str[2].substring(2,4);
	        int hour = Integer.parseInt(str[0]);
	        int minutes =Integer.parseInt(str[1]);
	        int sec = Integer.parseInt(seconds);
	        if(amPm.equals("PM") && hour !=12){
	            hour +=12;
	        }else if(amPm.equals("AM")){
	           if(hour ==12){
	            hour =0;
	           }
	        }
	        /*String time = ((hour<10)?"0":"")+ hour+":" +((minutes<10)? "0":"")+minutes +":"+((sec <10)? "0" :"")+seconds;*/
	        String time = ((hour<10)? "0"+hour :hour)+":"+str[1]+":"+seconds;
	        System.out.println(time);
	        return time;
    }
	
	static int sockMerchant(int n, int[] ar) {
        Map<String,Integer> pairs = new HashMap<String,Integer>();
        for(int i=0; i< ar.length; i++){
            Integer num = pairs.get(ar[i]+"_");
            if(num == null){
                pairs.put(ar[i]+"_",1);

            }else if(num !=null && num >0){
                pairs.put(ar[i]+"_",(num+1));
            }
        }
        System.out.println("size of Map:" + pairs.size());
        int countPairs =0;
        for(Map.Entry<String,Integer> obj : pairs.entrySet()){
            int pair = obj.getValue()/2;
            countPairs +=pair;
        }
        System.out.println("Pairs: " +countPairs);
    return countPairs;
    }
	
	static void levlUpDown(String s) {
		//Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        //String s = sc.next();
        System.out.println("Input :" +s);
        int v = 0;     // # of valleys
        int lvl = 0;   // current level
        for(char c : s.toCharArray()){
            if(c == 'U') ++lvl;
            if(c == 'D') --lvl;
            
            // if we just came UP to sea level
            if(lvl == 0 && c == 'U')
                ++v;
        }
        System.out.println("upDown: "+lvl);
        System.out.print("Level:" +v);
         s.toCharArray();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		levlUpDown("UDDDUDUU");
		levlUpDown("DDUDUDUUUU");
		
		int arr[] = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		//sockMerchant(9,arr);

		
		
		/*
		timeConversion("07:05:32PM");
		timeConversion("07:05:32AM");
		timeConversion("12:05:32AM");
		timeConversion("12:05:32PM");
*/		
		// TODO Auto-generated method stub
		 int sum[] = new int[args.length];
		 
		/*Calendar calendar = Calendar.getInstance();
		System.out.println(calendar);
		System.out.println(calendar.getTime());
		//calendar.set(2999, 8, 6,0, 0, 0);
		calendar.set(2015, 5-1, 8,0, 0, 0);
		System.out.println(calendar.getTime());
		System.out.println(calendar.getTime().getDay());*/
		
	}

}
