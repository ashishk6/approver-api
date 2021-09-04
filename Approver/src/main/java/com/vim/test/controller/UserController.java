package com.vim.test.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vim.test.entity.User;
import com.vim.test.service.UserServiceImpl;
import com.vim.test.vo.UserVO;


@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

	private final Logger LOG = LoggerFactory.getLogger(getClass());

	@Autowired
	private UserServiceImpl userServiceImpl;

	@GetMapping("/getUserDetails")
	List<User> fetchAllUsers() {
		LOG.debug("Fetch all users");
		return userServiceImpl.fetchAllUsers();
	}
	
	@PostMapping("/registerUser")
	User registerUser(@RequestBody UserVO user) {
		LOG.debug("Register user");
		return userServiceImpl.saveUser(user);
	}
	
	@PostMapping("/login")
	User login(@RequestBody UserVO user) {
		LOG.debug("Register user");
		return userServiceImpl.loginUser(user);
	}
	
	@GetMapping("/fetchUser/{emaild}")
	User fetchUser(@PathVariable("emaild") String emaild) {
		LOG.debug("fetchUser ");
		return userServiceImpl.fetchUser(emaild);
	}

	@GetMapping("/deleteUser/{id}")
	boolean login(@PathVariable("id") String id) {
		LOG.debug("Register user");
		return userServiceImpl.delete(id);
	}
	
	@GetMapping("/getBuyer")
	List<User> getBuyer() {
		LOG.debug("Fetch all getBuyer");
		return userServiceImpl.getBuyer();
	}
	@GetMapping("/getSupplier")
	List<User> getSupplier() {
		LOG.debug("Fetch all getSupplier");
		return userServiceImpl.getSupplier();
	}
}

