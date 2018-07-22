package com.learning11.wang;

import java.io.IOException;

public class Test01 {

	public static void main(String[] args) {
		Runtime run = Runtime.getRuntime();
		
		Process pro = null;
		
		try {
			pro = run.exec("D:\\Program Files\\Notepad++\\notepad++.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		pro.destroy();
	}

}
