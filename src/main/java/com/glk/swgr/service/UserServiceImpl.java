package com.glk.swgr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glk.swgr.mapper.UserMapper;
import com.glk.swgr.vo.UserVO;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserMapper userMapper;

	@Override
	public List<UserVO> selectAllUser() {
		return userMapper.selectAllUser();
	}

}
