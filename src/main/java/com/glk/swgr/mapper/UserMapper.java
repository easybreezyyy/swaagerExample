package com.glk.swgr.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.glk.swgr.vo.UserVO;

@Mapper
public interface UserMapper {
	
	List<UserVO> selectAllUser();
}
