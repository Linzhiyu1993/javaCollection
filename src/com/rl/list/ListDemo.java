package com.rl.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public ListDemo() {
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
	    System.out.println(lst);
	}
    
}
