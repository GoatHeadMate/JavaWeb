package com.GoatHeadMate.schedule.dao;

/**
 * Author: GoatHead Mate
 * DATA: 2024/7/29-07-29-上午11:06
 * Description: com.GoatHeadMate.schedule.dao
 * Version: 1.0
 */

import com.GoatHeadMate.schedule.pojo.SysUser;

/**
 * 用于针对表格的curd方法
 */

public interface SysUserDao {

    /**
     * 向数据库中增加一条用户记录的方法
     * @param sysUser 要增加的记录的username和user_pwd字段以SysUser实体类对象的形式接收
     * @return 增加成功返回1 增加失败返回0
     */
    int addSysUser(SysUser sysUser);

    SysUser findByUsername(String username);
}