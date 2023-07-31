package com.glk.swgr.sample2.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags= {"2. Sample2 컨트롤러"})
@RestController
public class Sample2Controller {
	
	@ApiOperation(value="메서드 소개", notes="메서드 설명")
	@GetMapping("/sample2")
	public HashMap<String, Object> sample2(String sampleParam){
		HashMap<String, Object> retMap = new HashMap<String, Object>();
		retMap.put("reqVal", sampleParam);
		return retMap;
	}

}
