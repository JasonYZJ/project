package yzj.project;

import java.util.Date;

public class Test extends Date{
	public static void main(String[] args) {
		new Test().test();
	}
	
	public void test(){
		//dasdasdsdasda
		System.out.println(getClass().getSuperclass().getName());
	}
}
