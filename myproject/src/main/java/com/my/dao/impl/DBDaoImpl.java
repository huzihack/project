package com.my.dao.impl;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.my.bean.UserInfo;
import com.my.dao.IDBDao;
import com.my.mapper.UserInfoMapper;
import com.my.util.DBHelper;

public class DBDaoImpl implements IDBDao {

	@Override
	public UserInfo getUserInfoById(Long id) {
		UserInfo user1 = null;
		try {
			SqlSession session = DBHelper.getSqlSession();
			UserInfoMapper info = session.getMapper(UserInfoMapper.class);
			user1 = info.getUserInfoById(id);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return user1;
	}

	@Override
	public UserInfo getUserInfoByObj(UserInfo info) {
		UserInfo user1 = null;
		try {
			SqlSession session = DBHelper.getSqlSession();
			UserInfoMapper info1 = session.getMapper(UserInfoMapper.class);
			user1 = info1.getUserInfoByObj(info);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return user1;
	}

	@Override
	public UserInfo getUserInfoByMap(Map<String, Object> map) {
		
		UserInfo user1 = null;
		try {
			SqlSession session = DBHelper.getSqlSession();
			UserInfoMapper info1 = session.getMapper(UserInfoMapper.class);
			user1 = info1.getUserInfoByMap(map);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return user1;
	}

	@Override
	public List<UserInfo> getUserInfos(Map<String, Object> map) {
		
		
		List<UserInfo> user1 = null;
		try {
			SqlSession session = DBHelper.getSqlSession();
			UserInfoMapper info1 = session.getMapper(UserInfoMapper.class);
			user1 = info1.getUserInfos(map);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return user1;
	}

	@Override
	public int insert(UserInfo userInfo) {
		int result=0;
		try {
			SqlSession session = DBHelper.getSqlSession();
			UserInfoMapper info1 = session.getMapper(UserInfoMapper.class);
			result=info1.insert(userInfo);
			session.commit();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public void update(UserInfo userInfo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(UserInfo userInfo) {
		// TODO Auto-generated method stub

	}

}
