package org.alien.mybatis.samples.service.impl;

import org.alien.mybatis.samples.model.Department;
import org.alien.mybatis.samples.service.DepartmentService;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class DepartmentServiceImplTest {

    private DepartmentService departmentService;

    @Before
    public void before() {
        departmentService = new DepartmentServiceImpl();
    }

    @Test
    public void testSelectDepartment() throws Exception {
        List<Department> list = departmentService.selectDepartment();
        System.out.println(Arrays.toString(list.toArray(new Department[list.size()])));
    }
}