package com.rl.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class LinkedlistDemo {

	public LinkedlistDemo() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args)
	{
		//add();
		//remove();
		Stack();
	}
	
	public static void add() 
	{
		ArrayList arr=new ArrayList();
		Vector vec=new Vector();
	    LinkedList linklist=new LinkedList();
	    linklist.add("林同学");
	    linklist.add("司马同学");
	    linklist.add("东方同学");
	    
	    //将指定元素插入到表的开头
	    linklist.addFirst("孙悟空");
	    Iterator iter=linklist.iterator();
	    while(iter.hasNext())
	    {
	    	String result=(String)iter.next();
	    	System.out.println(result);
	    }
	}
	public static void remove() {

	    LinkedList linklist=new LinkedList();
	    linklist.add(new Student("林同学",26));
	    linklist.add(new Student("司马同学",36));
	    linklist.add(new Student("东方同学",29));
	    
	    Student stu=(Student)linklist.removeFirst();
	    System.out.println(stu);
	    
//	    Iterator iter=linklist.iterator();
//	    while(iter.hasNext())
//	    {
//	    	String result=(String)iter.next();
//	    	System.out.println(result);
//	    }
	}
	
	public static void get()
	{
		LinkedList linklist=new LinkedList();
	    linklist.add(new Student("林同学",26));
	    linklist.add(new Student("司马同学",36));
	    linklist.add(new Student("东方同学",29));
	    
	}
	public static void Stack() {
		LinkedList linklist=new LinkedList();
		linklist.push(new Student("林同学",26));
		linklist.push(new Student("李同学",20));
		linklist.push(new Student("司马同学",16));
		
		Student stu=(Student)linklist.pop();
		System.out.println("出栈结果："+stu);
		System.out.println("--------------------------");
		Iterator iter=linklist.iterator();
	    while(iter.hasNext())
	    {
	    	Student result=(Student)iter.next();
	    	System.out.println(result);
	    }
	}
	
}
