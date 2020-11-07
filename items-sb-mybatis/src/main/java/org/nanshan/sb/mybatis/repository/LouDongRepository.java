package org.nanshan.sb.mybatis.repository;


import org.nanshan.sb.mybatis.po.LouDong;

import java.util.List;


public interface LouDongRepository {

    Long addLouDong(LouDong louDong);

    List<LouDong> list();
}
