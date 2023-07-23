package com.example.hoge.user;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {

	@Id
	@Column(name = "userId")
	String userId;

	@Column(name = "userName")
	String userName;
}
