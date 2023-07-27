package com.glk.swgr.sample1.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.glk.swgr.sample1.vo.UserVO;

@Service
public class UserServiceImpl implements UserService {
	
	@Override
	public List<UserVO> selectAllUser() {
		return new ArrayList<>(Arrays.asList(
				new UserVO(0,"뚱이") 
				, new UserVO(1,"스폰지밥")
				, new UserVO(2,"깐깐징어")
				));
	}

}
