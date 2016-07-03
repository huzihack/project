package com.my.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.my.bean.UserInfo;
import com.my.dao.IDBDao;
import com.my.dao.impl.DBDaoImpl;

public class Test {
	static IDBDao dao=new DBDaoImpl();
	public static void main(String[] args) {
//		UserInfo user=null;
//		user=dao.getUserInfoById(1L);
//		System.out.println(user.toString());
//		
//		UserInfo u2=new UserInfo();
//		u2.setUserName("王五");
//		user=dao.getUserInfoByObj(u2);
//		System.out.println(user.toString());
//		Map<String,Object> map=new HashMap<>();
//		map.put("userName", "张三");
//		user=dao.getUserInfoByMap(map);
//		System.out.println(user.toString());
//		
		
//		Map<String,Object> map1=new HashMap<>();
//	//	map1.put("userName", "张三");
//		List<UserInfo>users=dao.getUserInfos(map1);
//		System.out.println(users.toString());
		UserInfo userInfo=new UserInfo();
		userInfo.setUserName("茶杯");
		userInfo.setUserSex(1);
		int row=dao.insert(userInfo);
		System.out.println("row="+row+","+userInfo.getId());

	}

}
