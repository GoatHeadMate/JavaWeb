package com.GoatHeadMate.schedule.service;

/**
 * Author: GoatHead Mate
 * DATA: 2024/7/29-07-29-下午2:58
 * Description: com.GoatHeadMate.schedule.service
 * Version: 1.0
 */

import com.GoatHeadMate.schedule.pojo.SysUser;

/**
 * 定义了以sys_user表格为核心的业务处理
 */
public interface SysUserService {
    /**
     * 用户完成注册的业务方法
     * @param registUser 用于保存注册用户名和密码的对象
     * @return 注册成功返回>0的整数,否则返回0
     */
    int regist(SysUser registUser);

    SysUser findByUsername(String username);
}
