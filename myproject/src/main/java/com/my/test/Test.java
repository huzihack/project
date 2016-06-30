package com.my.test;

import java.util.List;

import com.my.bean.UserInfo;
import com.my.dao.IDBDao;
import com.my.dao.impl.DBDaoImpl;

public class Test {

	public static void main(String[] args) {
		IDBDao dao=new DBDaoImpl();
		List<UserInfo> users=dao.getTs(UserInfo.class,1);
		System.out.println(users.toString());

	}

}
