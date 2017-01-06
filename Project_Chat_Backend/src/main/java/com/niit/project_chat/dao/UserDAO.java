package com.niit.project_chat.dao;

import java.util.List;

import com.niit.project_chat.model.User;

public interface UserDAO {

	public List<User> list();

	public boolean save(User user);

	public boolean update(User user);

	public User get(String id);
	
	//if the user exist, return User instance else return null
	 public User validate(String id, String password);

	

}
