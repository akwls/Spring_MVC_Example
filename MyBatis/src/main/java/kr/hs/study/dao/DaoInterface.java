package kr.hs.study.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.hs.study.model.DataBean;

public interface DaoInterface {
	public void insert(DataBean dto);
	public List<DataBean> select();
	public void update(DataBean dto);
}
