package org.alien.mybatis.samples.service.impl;

import org.alien.mybatis.samples.mapper.DepartmentMapper;
import org.alien.mybatis.samples.model.Department;
import org.alien.mybatis.samples.service.DepartmentService;
import org.alien.mybatis.samples.util.MybatisConfigUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by andychen on 2015/5/7.<br>
 * Version 1.0-SNAPSHOT<br>
 */
public class DepartmentServiceImpl implements DepartmentService {
    @Override
    public List<Department> selectDepartment() {
        SqlSession sqlSession = MybatisConfigUtil.getSqlSessionFactory().openSession();
        List<Department> list = null;
        try {
            DepartmentMapper DepartmentMapper = sqlSession.getMapper(DepartmentMapper.class);
            list = DepartmentMapper.selectDepartment();
        } finally {
            sqlSession.close();
        }
        return list;
    }
}
