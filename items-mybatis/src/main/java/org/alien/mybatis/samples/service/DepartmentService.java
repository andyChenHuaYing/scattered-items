package org.alien.mybatis.samples.service;

import org.alien.mybatis.samples.model.Department;

import java.util.List;

/**
 * Created by andychen on 2015/5/7.<br>
 * Version 1.0-SNAPSHOT<br>
 */
public interface DepartmentService {
    List<Department> selectDepartment();
}
