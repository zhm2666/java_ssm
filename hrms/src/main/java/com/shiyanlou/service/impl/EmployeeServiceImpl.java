package com.shiyanlou.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shiyanlou.dao.EmployeeDao;
import com.shiyanlou.domain.Employee;
import com.shiyanlou.domain.Post;
import com.shiyanlou.service.EmployeeService;



@Transactional
@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    public List<Post> findEmployees(Map<String, Object> map) {

        return employeeDao.findEmployees(map);
    }

    public Integer getCount(Map<String, Object> map) {

        return employeeDao.getCount(map);
    }

    public Integer addEmployee(Employee employee) {
        Integer flag = null;
        try {
            //如果插入主键重复，抛出异常
            flag =  employeeDao.addEmployee(employee);
        } catch (Exception e) {
            throw new RuntimeException();
        }

        return flag;
    }

    public Integer updateEmployee(Employee employee) {

        return employeeDao.updateEmployee(employee);
    }

    public Integer deleteEmployee(String id) {

        return employeeDao.deleteEmployee(id);
    }

}
