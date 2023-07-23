package com.example.hoge.user;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

// クラスを右クリックで新規テストでなぜかうまく出来てしまったjpiterだからか?

@SpringBootTest
class MockTest {

	@InjectMocks
	private UserService service;

	@Mock
	private UserRepository repository;

	@Test
	void テストクラスの中でAutowiredしたい() {

		var users = new ArrayList<User>();
		users.add(new User());
		users.add(new User());
		users.add(new User());
		users.add(new User());
		users.add(new User());
		Mockito.doReturn(users).when(repository).findAll();
		assertEquals(5, service.updateUser());
	}

	@Test
	void 特に意味はないがServiceがインスタンス化していることを確認したかった() {
		assertTrue(service.hogehoge());
	}
}