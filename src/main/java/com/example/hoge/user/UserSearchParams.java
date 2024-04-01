package com.example.hoge.user;

import com.example.hoge.SearchParams;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class UserSearchParams extends SearchParams {
	private String userId;
	private String userName;
}
