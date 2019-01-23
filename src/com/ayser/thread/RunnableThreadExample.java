/**
 * 
 */
package com.ayser.thread;

/**
 * @author Ayser
 *
 */
public class RunnableThreadExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MyThread myThread = new MyThread();
		Thread thread = new Thread(myThread,"Runnable Thread");
		
		String str = "Hello";
		str.toCharArray();
		//thread.getName();
		thread.start();
	}

}


class MyThread implements Runnable{
	private int num;
	private int uptoTable =10;
	
	public MyThread(){
		num =5;
		uptoTable=10;
	}
	
	public MyThread(int num, int uptoTable) {
		this.num = num;
		this.uptoTable =uptoTable;
	}
	
	@Override
	public void run() {
		
		try {
			
			for(int i=1 ; i<=uptoTable; i++)
			{
				System.out.println(num + " x " + i + " = " +(num*i));
				if(i ==6) {
					Thread.sleep(2000);
				}
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
}