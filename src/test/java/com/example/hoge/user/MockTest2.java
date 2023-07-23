package com.example.hoge.user;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

// クラスを右クリックで新規テストでなぜかうまく出来てしまったjpiterだからか?

@SpringBootTest
class MockTest2 {

	@InjectMocks
	private UserService service;

	@Test
	void DB起動していないとSpringが起動出来ないのでテスト出来ない説() {
		assertTrue(service.hogehoge());
	}
}