package com.home.elen;

import java.util.List;


import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import lombok.extern.log4j.Log4j;
@Log4j
public class elenServiceImpl implements elenService {

	@Inject
	private elenDAO dao;
	
	@Override
	public List<elenVO> getList() {
		// TODO Auto-generated method stub
		log.info("getList.......");
		return dao.getList();
	}

}
