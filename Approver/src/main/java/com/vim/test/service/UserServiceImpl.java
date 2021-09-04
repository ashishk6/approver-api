package com.vim.test.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

import com.vim.test.entity.User;
import com.vim.test.repository.UserRepository;
import com.vim.test.vo.UserVO;

@Service
public class UserServiceImpl {
	
	@Autowired
	private UserRepository userRepository;
	
	
	public List<User> fetchAllUsers() {
		return userRepository.findAll();
	}
	public User saveUser(UserVO userVO){
		ModelMapper modelMapper = new ModelMapper();
		User savedUser = modelMapper.map(userVO, User.class);
		savedUser = userRepository.save(savedUser);
		return savedUser;
	}
	public boolean login(UserVO userVO) {
		User user = userRepository.findByEmailId(userVO.getEmailId());
		return (user!=null && userVO.getPassword().equals(user.getPassword()));
	}
	public User loginUser(UserVO userVO) {
		//ModelMapper modelMapper = new ModelMapper();
		//User updateUser = modelMapper.map(userVO, User.class);
		//User user = userRepository.findByEmailId(userVO.getEmailId());
	    User updateUser =null;
		Optional<User> user = Optional.of(userRepository.findByEmailId(userVO.getEmailId()));
		if(user.isPresent()){
			updateUser = user.get();
			System.out.print(updateUser.getPassword());
			System.out.print(updateUser.getPassword().equals(userVO.getPassword()));
			if(updateUser!=null && updateUser.getPassword().equals(userVO.getPassword()))
					{
						System.out.println(updateUser.getPassword());
						System.out.println(userVO.getPassword());
						return updateUser;
					}
			else
			{
				 updateUser=null;
			}
		}
		return updateUser;
	}
	
	public boolean delete(String id) {
		userRepository.deleteById(id);
		return true;
	}
	public User fetchUser(String emaild) {
		// TODO Auto-generated method stub
	    User updateUser =null;
		Optional<User> user = Optional.of(userRepository.findByEmailId(emaild));
		if(user.isPresent()){
			updateUser = user.get();
		}
		return updateUser;
	}
	public List<User> getBuyer() {
		// TODO Auto-generated method stub
		List<User> users = userRepository.findByDesignation("0");
		return users;
	}
	public List<User> getSupplier() {
		// TODO Auto-generated method stub
		List<User> users = userRepository.findByDesignation("1");
		return users;
	}

}

