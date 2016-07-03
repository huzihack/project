package com.my.dubbo;

import com.impl.MyService;

public class MyServiceImpl implements MyService  {

	@Override
	public String sayHello(String str) {
		// TODO Auto-generated method stub
		System.out.println("进来了 ="+str);
		return "Hello "+str;
	}

}
