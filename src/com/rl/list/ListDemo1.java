package com.rl.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public ListDemo1() {
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
	    
	    //根据索引获取list中指定的元素
	    Object obj=lst.get(0);
	    String str=(String)obj;
	    System.out.println(str);
	    
	    //获得list元素个数
	    Integer length=lst.size();
	    System.out.println(length);
	    for(int i=0;i<lst.size();i++)
	    {
	    	String result=(String)lst.get(i);
	    	System.out.println(result);
	    }
	    Object obj1=lst.remove(2);
	    System.out.println(obj1);
	    
	    boolean isDelete=lst.remove("张同学");
	    System.out.println(isDelete);
	    
	    lst.clear();
	}
    
}
