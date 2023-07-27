package com.glk.swgr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.glk.swgr.service.UserService;
import com.glk.swgr.vo.UserVO;

import io.swagger.annotations.Api;
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
	@PostMapping("/user")
	@ResponseBody
	public String test(){
		return "it works";
	}
}
