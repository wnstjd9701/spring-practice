package com.sample.myapp.member;

public class MemberService implements IMemberService{

	@Override
	public MemberVO getMemberInfo() {
		MemberVO vo = new MemberVO();
		vo.setMemberId("1234");
		vo.setName("홍길동");
		vo.setAge(25);
		vo.setEmail("test@example.com");
		
		return vo;
	}
	
}
