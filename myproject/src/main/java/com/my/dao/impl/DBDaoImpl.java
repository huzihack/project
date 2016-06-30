package com.my.dao.impl;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.my.dao.IDBDao;
import com.my.util.DBHelper;

public class DBDaoImpl implements IDBDao {

	@Override
	public <T> List<T> getTs(Class<T>cla,Object params) {
		
		SqlSession session=null;
		try {
			session=DBHelper.getSqlSession();
			return session.selectList("bean.User.queryUserInfoById", params);
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(null!=session){
				session.close();
			}
		}
		return null;
	}

	@Override
	public <T> T getT(Class<T> cla,Object params) {
		// TODO Auto-generated method stub
		return null;
	}

}
