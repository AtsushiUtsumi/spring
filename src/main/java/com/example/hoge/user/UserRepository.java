package com.example.hoge.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

/**
 * @author atsushi
 *
 */
@Repository
public class UserRepository {
	public List<User> findAll() {
		var result = new ArrayList<User>();
		result.add(new User());
		result.add(new User());this.findByUserName(null);
		result.add(new User());
		return result;
	}

	/**
	 * 検索
	 * @param userName ユーザー名
	 * @return 検索結果(中間一致)
	 */
	public List<User> findByUserName(String userName) {

		var result = new ArrayList<User>();
		result.add(new User());
		result.add(new User());
		result.add(new User());

		return result;
	}
}
