package com.xhc.service.impl;

import java.util.List;

import com.xhc.dao.IPoetriesDAO;
import com.xhc.model.Poetries;
import com.xhc.service.IPoetriesService;

public class PoetriesService implements IPoetriesService {
	private IPoetriesDAO poetriesDAO;
	
	public IPoetriesDAO getPoetriesDAO() {
		return poetriesDAO;
	}

	public void setPoetriesDAO(IPoetriesDAO poetriesDAO) {
		this.poetriesDAO = poetriesDAO;
	}

	@Override
	public List<Poetries> queryByName(String name, int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		return poetriesDAO.queryByName(name, currentPage, pageSize);
	}

	@Override
	public int getTotalByName(String name) {
		// TODO Auto-generated method stub
		return poetriesDAO.getTotalByName(name);
	}

	@Override
	public List<Poetries> queryByTitle(String title) {
		// TODO Auto-generated method stub
		return poetriesDAO.queryByTitle(title);
	}

	@Override
	public List<Poetries> queryByContent(String content) {
		// TODO Auto-generated method stub
		return poetriesDAO.queryByContent(content);
	}



}
