package com.example.cbd.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.cbd.entity.MemberRegistrationEntity;

@Mapper
public interface RegisterMemberMapper {
	
	public void insertMemberInfo(MemberRegistrationEntity entity);

}
