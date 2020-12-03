package com.photozone.www.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.photozone.www.domain.TestDto;

@Mapper
public interface TestMapper {
	public List<TestDto> getALL() throws Exception;
}
