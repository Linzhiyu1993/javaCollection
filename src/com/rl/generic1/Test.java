package com.rl.generic1;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args)
	{
		GenericTest<Integer> gt=new GenericTest<Integer>();
		gt.setT(20);
		Integer i=gt.getT();
		System.out.println(i);
		
		GenericTest<String> gt1=new GenericTest<String>();
		gt1.setT("张三");
		String str=gt1.getT();
		System.out.println(str);
	}

}
