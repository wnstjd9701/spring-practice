package com.sample.myapp.member;


import lombok.Setter;

@Setter
public class MemberController {
	private IMemberService memberService;

//	public MemberController(IMemberService memberService) {
//		this.memberService = memberService;
//	}
	
	public void printMemberInfo() {
		MemberVO vo = memberService.getMemberInfo();
		System.out.println(vo);
	}
}
