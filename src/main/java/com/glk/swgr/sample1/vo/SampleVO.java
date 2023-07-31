package com.glk.swgr.sample1.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@ApiModel(value = "SampleVO입니다", description = "VO설명")
public class SampleVO {
	
	@ApiModelProperty(required = true)
	private String firstName;
	
	@ApiModelProperty(required = true)
	private String lastName;
}
