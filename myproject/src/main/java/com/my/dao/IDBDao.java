package com.my.dao;

import java.util.List;

public interface IDBDao {
	
	
	public <T> List<T> getTs(Class<T> cla,Object params);
	
	public <T>T getT(Class<T> cla,Object params);
	
	
	

}
