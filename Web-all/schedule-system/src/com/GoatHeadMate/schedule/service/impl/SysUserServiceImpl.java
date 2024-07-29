package com.GoatHeadMate.schedule.service.impl;

import com.GoatHeadMate.schedule.dao.SysUserDao;
import com.GoatHeadMate.schedule.dao.impl.SysUserDaoImpl;
import com.GoatHeadMate.schedule.pojo.SysUser;
import com.GoatHeadMate.schedule.service.SysUserService;
import com.GoatHeadMate.schedule.utils.MD5Util;

/**
 * Author: GoatHead Mate
 * DATA: 2024/7/29-07-29-下午3:03
 * Description: com.GoatHeadMate.schedule.service.impl
 * Version: 1.0
 */
public class SysUserServiceImpl  implements SysUserService {
    private SysUserDao userDao =new SysUserDaoImpl();
    @Override
    public int regist(SysUser sysUser) {

        // 将用户的明文密码转换为密文密码
        sysUser.setUserPwd(MD5Util.encrypt(sysUser.getUserPwd()));
        // 调用DAO 层的方法  将sysUser信息存入数据库
        return userDao.addSysUser(sysUser);
    }

    @Override
    public SysUser findByUsername(String username) {
        // 调用服务层方法,继续查询

        return userDao.findByUsername(username);
    }
}
