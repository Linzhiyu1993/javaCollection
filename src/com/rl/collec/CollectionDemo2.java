package com.rl.collec;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo2 {

	public CollectionDemo2() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args)
	{
		//创建arrayList集合
		Collection c=new ArrayList();
		c.add("linzhiyu");
		c.add("abc");
		c.add("eeee");
		c.add("ttttt");
		//System.out.println(c);
		
		//返回迭代器，迭代器是依赖于集合的，不能给别的集合使用
		Iterator iter=c.iterator();
		//判断是否有下一个元素
		while(iter.hasNext()) {
			Object obj=iter.next();
			System.out.println(obj);
		}
		
	}

}
