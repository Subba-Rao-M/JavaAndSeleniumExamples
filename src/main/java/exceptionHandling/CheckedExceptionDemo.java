package exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		System.out.println("Program Started");
		System.out.println("Program In Progress");
		
		Thread.sleep(5000);
		
		FileInputStream fis = new FileInputStream("C:\\test.txt");
		/*
		try {
		Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		*/
		System.out.println("Program Ended");
		System.out.println("Program Exited");
	}

}
