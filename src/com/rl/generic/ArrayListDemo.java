package com.rl.generic;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public ArrayListDemo() {
		// TODO Auto-generated constructor stub
	}
    public static void main(String[] args)
    {
    	method();
    }
    public static void method()
    {
    	ArrayList a1=new ArrayList();
    	a1.add(new Student("李四",20));
    	Iterator iter=a1.iterator();
    	while(iter.hasNext())
    	{
    		Student result=(Student)iter.next();
    		System.out.println(result);
    	}
    }
}
