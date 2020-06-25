package com.example.cbd.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.cbd.security.Account;

@Mapper
public interface LoginMapper {
	//USERテーブルからユーザ名とパスワードを取得。
		public Account findAccount(String name);
}
