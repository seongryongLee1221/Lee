package com.home.elen;

import java.util.List;

import org.apache.ibatis.annotations.Select;

public interface elenDAO {

	//@Select("select * from elen where bno > 0")
	public List<elenVO> getList();
}
