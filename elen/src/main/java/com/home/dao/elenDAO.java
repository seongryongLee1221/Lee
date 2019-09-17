package com.home.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.home.domain.elenVO;

public interface elenDAO {

	//@Select("select * from elen where bno > 0")
	public List<elenVO> getList();
}
