package com.example.hoge.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;// てかここで具象クラスをAutowiredしても意味なくね?

	public int updateUser() {
		return repository.findAll().size();
	}
	
	public boolean hogehoge() {
		return true;
	}
}
