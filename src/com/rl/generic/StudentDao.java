package com.rl.generic;

import java.util.ArrayList;
import java.util.List;

public class StudentDao implements BaseDao<Student> {
    List<Student> list=new ArrayList<Student>();
	
	@Override
	public void Save(Student t) {
		// TODO Auto-generated method stub
		list.add(t);
	}

	@Override
	public Student getT(Integer id) {
		// TODO Auto-generated method stub
		return list.get(id);
	}

	@Override
	public List<Student> listT() {
		// TODO Auto-generated method stub
		return list;
	}
   
}
