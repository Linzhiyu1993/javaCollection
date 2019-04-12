package com.rl.generic;

import java.util.List;

public class TestDao {
    private static BaseDao<Student> baseDao=new StudentDao();
    private static BaseDao<User> userBaseDao=new UserDao();
	public TestDao() {
		// TODO Auto-generated constructor stub
	}
    public static void main(String[] args)
    {
//    	testSave();
//    	testGetAll();
    	testSaveUser();
    	testGetAllUser();
    }
    public static void testSave()
    {
    	Student stu=new Student("张三",30);
    	Student stu1=new Student("李四",20);
    	baseDao.Save(stu);	
    	baseDao.Save(stu1);
    	List s=baseDao.listT();
    }
    public static void testGet()
    {
    	Student s=baseDao.getT(1);
    	System.out.println(s);
    }
    public static void testGetAll()
    {
    	List<Student> sList=baseDao.listT();
    	System.out.println(sList);
    }
    public static void testSaveUser()
    {
    	User usr=new User("张三",30);
    	User usr1=new User("张三11",30);
    	userBaseDao.Save(usr);	
    	userBaseDao.Save(usr1);
    }
    public static void testGetAllUser()
    {
    	List<User> sList1=userBaseDao.listT();
    	System.out.println(sList1);
    }
}
