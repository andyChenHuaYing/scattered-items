package org.nanshan.sb.mybatis.controller;

import org.nanshan.sb.mybatis.po.User;
import org.nanshan.sb.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public Object list() {
		return userService.list();
	}
	
	@GetMapping("/add")
	public Object add() {
		for (long i = 0; i < 100; i++) {
			User user = new User();
			user.setId(i);
			user.setCity("深圳");
			user.setName("李四");
			userService.add(user);
		}
		return "success";
	}
	
	@GetMapping("/users/{id}")
	public Object get(@PathVariable Long id) {
		return userService.findById(id);
	}
	
	@GetMapping("/users/query")
	public Object get(String name) {
		return userService.findByName(name);
	}
	
}
