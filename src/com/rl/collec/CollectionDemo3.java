package com.rl.collec;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo3 {

	public CollectionDemo3() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args)
	{
		//创建arrayList集合
		Collection c=new ArrayList();
		Student s=new Student("张三",34);
		Student s1=new Student("李四",24);
		Student s2=new Student("王五",30);
		Student s3=new Student("武松",29);
		Student s4=new Student("李逵",27);
		c.add(s);
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		Iterator it=c.iterator();
		while(it.hasNext()) {
			//获得集合中的一个元素
			Object obj=it.next();
			Student stu=(Student)obj;
			System.out.println(stu);
		}
	}

}
