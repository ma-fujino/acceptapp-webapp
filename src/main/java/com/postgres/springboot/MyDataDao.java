package com.postgres.springboot;

import java.io.Serializable;
import java.util.List;

public interface MyDataDao<T> extends Serializable {
	public List<T> getAll();
	public List<T> find(String fstr);
	public T findById(long id);
//	public List<T> findByName(String name);
}
