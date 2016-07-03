package com.my.mapper;

import java.util.List;
import java.util.Map;

import com.my.bean.UserInfo;

public interface UserInfoMapper {
	
	public UserInfo getUserInfoById(Long id);
	public UserInfo getUserInfoByObj(UserInfo info);
	public UserInfo getUserInfoByMap(Map<String,Object> map);
	public List<UserInfo> getUserInfos(Map<String,Object> map);
	
	public int insert(UserInfo userInfo);
	public void update (UserInfo userInfo);
	public void delete (UserInfo userInfo);

}
