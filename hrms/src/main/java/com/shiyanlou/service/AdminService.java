package com.shiyanlou.service;

import java.util.List;
import java.util.Map;

import com.shiyanlou.domain.Admin;

public interface AdminService {

    /** 登录
     *
     * @param admin
     * @return
     */
    public Admin login(Admin admin);

    /** 根据条件查询管理员
     *
     * @param map
     * @return
     */
    public List<Admin> findAdmins(Map<String, Object> map);

    /** 根据条件查询管理员人数
     *
     * @param map
     * @return
     */
    public Integer getCount(Map<String, Object> map);

    /** 添加管理员
     *
     * @param admin
     * @return
     */
    public Integer addAdmin(Admin admin);

    /** 修改管理员
     *
     * @param admin
     * @return
     */
    public Integer updateAdmin(Admin admin);

    /** 删除管理员
     *
     * @param id
     * @return
     */
    public Integer deleteAdmin(Integer id);
}
