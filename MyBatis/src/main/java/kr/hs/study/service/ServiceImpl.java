package kr.hs.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hs.study.dao.DaoImpl;
import kr.hs.study.dao.DaoInterface;
import kr.hs.study.model.DataBean;

@Service
public class ServiceImpl implements TestInterface {
	@Autowired
	private DaoInterface dao;

	public void insert(DataBean dto) {
		dao.insert(dto);
	}
	
	public List<DataBean> select() {
		return dao.select();
	}
	
	public void update(DataBean dto) {
		dao.update(dto);
	}

}
