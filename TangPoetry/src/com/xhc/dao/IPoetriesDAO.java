package com.xhc.dao;

import java.util.List;

import com.xhc.model.Poetries;

public interface IPoetriesDAO {
	//通过诗人名查询信息。
	public List<Poetries> queryByName(String name,int currentPage,int pageSize);
	//通过诗人名查询诗人的诗词总数
	public int getTotalByName(String name);
	//通过诗词名程序查询信息。
	public List<Poetries> queryByTitle(String title);
	//通过诗词名句查询信息。
	public List<Poetries> queryByContent(String content);
}
