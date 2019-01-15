/**
 * 
 */
package com.ayser.thread;

/**
 * @author Ayser
 *
 */
public class ThreadExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

			MyThread2 myThread = new MyThread2();
			myThread.start();
	}

}

class MyThread2 extends Thread {
	
	private int num ;
	private int uptoTable =10;
	
	public MyThread2(){
		num=6;
	}
	
	public MyThread2(int num, int uptoTable) {
		this.num = num;
		this.uptoTable =uptoTable;
	}
	
	@Override
	public void run() {
		try {
			for(int i=1; i<= uptoTable; i++) {
				System.out.println(num + " x " + i + " = " +(num*i));
				if(i==6) {
					Thread.sleep(4000);
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}