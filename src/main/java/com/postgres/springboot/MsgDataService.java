package com.postgres.springboot;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Service;

@Service
public class MsgDataService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	public List<MsgData> getAll() {
		return (List<MsgData>) entityManager.createQuery("from MsgData").getResultList();
	}
	
	public MsgData get(int num) {
		return (MsgData)entityManager.createQuery("from MsgData where id = " + num).getSingleResult();
	}
	
	public List<MsgData> find(String fstr) {
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<MsgData> query = builder.createQuery(MsgData.class);
		Root<MsgData> root = query.from(MsgData.class);
		query.select(root).where(builder.equal(root.get("name"), fstr));
		List<MsgData> list = null;
		list = (List<MsgData>) entityManager.createQuery(query).getResultList();
		return list;
	}
	
	public List<MsgData> find(String  title, String message) {
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<MsgData> query = builder.createQuery(MsgData.class);
		Root<MsgData> root = query.from(MsgData.class);
		query.select(root).where(builder.equal(root.get("title"), title)
				, builder.equal(root.get("message"), message));
		List<MsgData> list = null;
		list = (List<MsgData>) entityManager.createQuery(query).getResultList();
		return list;
	}

}
