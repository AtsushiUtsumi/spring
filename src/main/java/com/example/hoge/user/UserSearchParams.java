package com.example.hoge.user;

import com.example.hoge.SearchParams;

import lombok.Data;

@Data
public class UserSearchParams extends SearchParams{
	private String userId;
	private String userName;
}
