package com.glk.swgr.sample1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.glk.swgr.sample1.service.UserService;
import com.glk.swgr.sample1.vo.SampleVO;
import com.glk.swgr.sample1.vo.UserVO;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(tags= {"1. 사용자 정보 컨트롤러"})
@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	@ApiOperation(value="사용자 전체 목록 조회", notes="사용자 전체 목록을 조회한다")
	@GetMapping("/user")
	public List<UserVO> selectAllUser(){
		return userService.selectAllUser();
	}
	
	@ApiOperation(value="테스트 post 매핑")
	@ApiImplicitParams({
		@ApiImplicitParam(name="firstName" , value="사용자 성", example="홍", required = true),
		@ApiImplicitParam(name="lastName" , value="사용자 이름", example="길동", required = true)
		})
	@PostMapping("/user")
	@ResponseBody
	public SampleVO test(String firstName, String lastName){
		return new SampleVO(firstName, lastName);
	}
}
