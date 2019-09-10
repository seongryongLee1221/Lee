package com.home.service;

import java.util.List;


import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.home.dao.elenDAO;
import com.home.domain.elenVO;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
@Log4j
@Service
@AllArgsConstructor
public class elenServiceImpl implements elenService {

	@Autowired
	private elenDAO dao;
	
	@Override
	public List<elenVO> getList() {
		// TODO Auto-generated method stub
		log.info("getList.......");
		return dao.getList();
	}

}
