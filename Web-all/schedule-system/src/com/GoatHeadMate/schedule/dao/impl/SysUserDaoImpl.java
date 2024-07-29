package com.GoatHeadMate.schedule.dao.impl;

import com.GoatHeadMate.schedule.dao.BaseDao;
import com.GoatHeadMate.schedule.dao.SysUserDao;
import com.GoatHeadMate.schedule.pojo.SysUser;

import java.util.List;

/**
 * Author: GoatHead Mate
 * DATA: 2024/7/29-07-29-下午2:20
 * Description: com.GoatHeadMate.schedule.dao.impl
 * Version: 1.0
 */
public class SysUserDaoImpl extends BaseDao implements SysUserDao {
    @Override
    public int addSysUser(SysUser sysUser) {
        String sql ="insert into sys_user values(DEFAULT,?,?)";
        return baseUpdate(sql,sysUser.getUsername(),sysUser.getUserPwd());
    }

    @Override
    public SysUser findByUsername(String username) {
        String sql ="select uid,username, user_pwd userPwd from sys_user where username = ?";
        List<SysUser> sysUserList = baseQuery(SysUser.class, sql, username);
        return sysUserList!=null&&sysUserList.size()>0?sysUserList.get(0):null;
    }
}