package com.example.hoge.user;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

// クラスを右クリックで新規テストでなぜかうまく出来てしまったjpiterだからか?

@SpringBootTest
class UserServiceTest2 {

	@Autowired
	UserRepository repository;

	@Test
	void テストクラスの中でAutowiredしたい() {
		var x = repository.findByUserName("Atsushi");
		assertEquals(3, x.size());
		// まぁ、テスト対象のクラスはServiceクラスなんですけどね...
	}

	@Test
	void 特に意味はない() {
		assertTrue(true);
	}
}
