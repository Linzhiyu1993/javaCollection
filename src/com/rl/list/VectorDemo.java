package com.rl.list;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public VectorDemo() {
		// TODO Auto-generated constructor stub
	}
    public static void main(String[] args)
    {
    	addElement();
    }
    public static void addElement(){
    	Vector vec=new Vector();
    	vec.add(new Student("林同学",30));
    	vec.add(new Student("李同学",20));
    	vec.add(new Student("林同学",40));
    	//System.out.println(vec);
    	
    	Student s=(Student)vec.elementAt(1);
    	Enumeration enu= vec.elements();
    	while(enu.hasMoreElements())
    	{
    		Student stu=(Student)enu.nextElement();
    		System.out.println(stu);
    	}
    }
}
