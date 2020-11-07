package org.nanshan.sb.mybatis.service;


import org.nanshan.sb.mybatis.po.LouDong;

import java.util.List;

public interface LouDongService {

	List<LouDong> list();
	
	Long addLouDong(LouDong louDong);
		
}
