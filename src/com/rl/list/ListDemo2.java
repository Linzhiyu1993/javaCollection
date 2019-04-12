package com.rl.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {

	public ListDemo2() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args)
	{
	    List lst=new ArrayList();
	    lst.add("林同学");
	    lst.add("李同学");
	    lst.add("王同学");
	    lst.add("司马同学");
	    lst.add(1,"张同学");
	    
	    ListIterator iter=lst.listIterator();
	    while(iter.hasNext()) {
	    	String result=(String) iter.next();
	    	System.out.println(result);
	    }
	    
	    System.out.println("----------------------");
	    //获得前一个元素
	    String str=(String)iter.previous();
	    System.out.println(str);
	    
	    
	}
    
}
