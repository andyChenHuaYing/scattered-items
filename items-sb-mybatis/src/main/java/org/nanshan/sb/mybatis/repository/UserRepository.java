package org.nanshan.sb.mybatis.repository;

import org.nanshan.sb.mybatis.po.User;

import java.util.List;


public interface UserRepository {
	
	Long addUser(User user);
	
	List<User> list();
	
	User findById(Long id);
	
	User findByName(String name);
}
