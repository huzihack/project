package com.my.util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBHelper {
	
	/**
	 * 通过factory 获取sqlsession
	 * @return
	 * @throws IOException
	 */
	public static SqlSession getSqlSession() throws IOException{
		Reader reader=Resources.getResourceAsReader("com/my/config/Configuration.xml");
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(reader);
		return factory.openSession();
	}
 
}
