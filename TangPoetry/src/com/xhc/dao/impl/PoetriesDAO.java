package com.xhc.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xhc.dao.IPoetriesDAO;
import com.xhc.model.Poetries;

public class PoetriesDAO implements IPoetriesDAO {
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	/**
	 * 通过诗人名查询诗词名称
	 */
	@Override
	public List<Poetries> queryByName(String name, int currentPage, int pageSize) {
		Session session = sessionFactory.openSession();
		Transaction ts = session.beginTransaction();
		String hql = "select b from Poets a,Poetries b where a.id=b.poetId and a.name=?";
		Query query = session.createQuery(hql);
		int startRow = (currentPage - 1) * pageSize;
		query.setFirstResult(startRow);
		query.setMaxResults(pageSize);
		query.setString(0, name);
		List poetries = query.list();
		ts.commit();
		session.close();
		return poetries;
	}

	/**
	 * 通过诗人名获取该诗人名下所有诗词数量
	 */
	@Override
	public int getTotalByName(String name) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction ts = session.beginTransaction();
		Query query = session.createQuery("select b from Poets a,Poetries b where a.id=b.poetId and a.name=?");
		query.setString(0, name);
		List poetries = query.list();
		ts.commit();
		session.close();
		return poetries.size();
	}

	/**
	 * 通过诗词名查询
	 */
	@Override
	public List<Poetries> queryByTitle(String title) {
		Session session = sessionFactory.openSession();
		Transaction ts = session.beginTransaction();
		// String hql = "select b from Poetries b where b.title=?";//
		// 这样写和下面的hql语句一样吗？
		String hql = "select b from Poetries b,Poets a where a.id=b.poetId and b.title=?";
		Query query = session.createQuery(hql);
		query.setString(0, title);
		List poetries = query.list();
		ts.commit();
		session.close();
		return poetries;
	}

	/**
	 * 通过诗词名句查询
	 */
	@Override
	public List<Poetries> queryByContent(String content) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.openSession();
		Transaction ts = session.beginTransaction();
		String hql = "select b from Poets a,Poetries b where a.id=b.poetId and b.content LIKE ?";
		if (!content.equals("") && !content.contains("%")) {
			Query query = session.createQuery(hql);
			query.setString(0, "%" + content + "%");
			List poetries = query.list();
			ts.commit();
			session.close();
			return poetries;
		} else {
			return null;
		}
	}

}
