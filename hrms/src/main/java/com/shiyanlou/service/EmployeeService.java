package com.shiyanlou.service;

import java.util.List;
import java.util.Map;

import com.shiyanlou.domain.Employee;
import com.shiyanlou.domain.Post;

public interface EmployeeService {

    /** 根据条件查询员工
     *
     * @param map
     * @return
     */
    public List<Post>findEmployees(Map<String, Object> map);

    /** 根据条件查询员工人数
     *
     * @param map
     * @return
     */
    public Integer getCount(Map<String, Object> map);

    /** 添加员工
     *
     * @param employee
     * @return
     */
    public Integer addEmployee(Employee employee);

    /** 修改员工
     *
     * @param employee
     * @return
     */
    public Integer updateEmployee(Employee employee);

    /** 删除员工
     *
     * @param id
     * @return
     */
    public Integer deleteEmployee(String id);
}
