package com.transbank.lib.testqueue;

public class App {

	public static void main(String[] args) throws Exception{
		
		Properties properties = new Properties();
		
		System.out.println("spdh:  "+properties.getSpdh());
		System.out.println("saldo:  "+properties.getSaldo());
		
		thread(new Producer(), false);
//        thread(new Producer(), false);
//        thread(new Consumer(), false);
//        Thread.sleep(1000);
//        thread(new Producer(), false);
//        thread(new Consumer(), false);
//        thread(new Producer(), false);
//        thread(new Consumer(), false);
//        Thread.sleep(1000);
//        thread(new Producer(), false);
//        thread(new Consumer(), false);
//        thread(new Producer(), false);
//        thread(new Consumer(), false);
//        thread(new Producer(), false);
//        thread(new Consumer(), false);
//        Thread.sleep(1000);
//        thread(new Consumer(), false);
//        thread(new Producer(), false);
//        thread(new Consumer(), false);
//        thread(new Producer(), false);
//        thread(new Consumer(), false);
//        thread(new Consumer(), false);
//        thread(new Producer(), false);
//        thread(new Consumer(), false);
//        thread(new Producer(), false);
//        thread(new Consumer(), false);
//        thread(new Producer(), false);

	}
	
	public static void thread(Runnable runnable, boolean daemon) {
		System.out.println("Iniciando Thread");
		Thread brokerThread = new Thread(runnable);
		
		brokerThread.setDaemon(daemon);
		brokerThread.start();
		
	}

}
