package com.sample.myapp.member;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class MemberVO {
	private String memberId;
	private String name;
	private int age;
	private String email;
}
