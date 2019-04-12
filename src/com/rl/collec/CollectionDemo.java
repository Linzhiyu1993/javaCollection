package com.rl.collec;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public CollectionDemo() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args)
	{
		//创建arrayList集合
		Collection c=new ArrayList();
		System.out.println(c);
		c.add("linzhiyu");
		c.add("abc");
		c.add("eeee");
		c.add("ttttt");
		System.out.println(c);
		
		Collection c1=new ArrayList();
		c1.add("wangwu");
		c1.addAll(c);
		System.out.println(c1);
		
		Collection c2=new ArrayList();
		//对于基本类型的添加自动做了装箱，其实添加的是integer
		c2.add(1);
		c2.add("llllalalalal");
		
		System.out.println("---------------------------");
		//c2.clear();
		c2.remove(1);
		System.out.println(c2);
		
		boolean isExit=c.contains("tets");
		System.out.println(isExit);
		boolean isExiAll=c1.contains(c2);
		System.out.println(isExiAll);
		
		c.clear();
		boolean isEmpty=c.isEmpty();
		System.out.println(isEmpty);
		
		//把集合转换成数组
		Object[] objArray=c.toArray();
		for(int i=0;i<objArray.length;i++)
		{
			System.out.println(objArray[i]);
		}
	}

}
