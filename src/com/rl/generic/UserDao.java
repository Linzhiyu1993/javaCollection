package com.rl.generic;

import java.util.ArrayList;
import java.util.List;

public class UserDao implements BaseDao<User> {
    List<User> u=new ArrayList<User>();
	public UserDao() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Save(User t) {
		// TODO Auto-generated method stub
		u.add(t);
	}

	@Override
	public User getT(Integer id) {
		// TODO Auto-generated method stub
		return u.get(id);
	}

	@Override
	public List<User> listT() {
		// TODO Auto-generated method stub
		return u;
	}

}
