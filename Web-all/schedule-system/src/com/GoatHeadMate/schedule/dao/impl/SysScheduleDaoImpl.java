package com.GoatHeadMate.schedule.dao.impl;

import com.GoatHeadMate.schedule.dao.BaseDao;
import com.GoatHeadMate.schedule.dao.SysScheduleDao;
import com.GoatHeadMate.schedule.pojo.SysSchedule;

import java.util.List;

/**
 * Author: GoatHead Mate
 * DATA: 2024/7/29-07-29-下午2:21
 * Description: com.GoatHeadMate.schedule.dao.impl
 * Version: 1.0
 */
public class SysScheduleDaoImpl extends BaseDao implements SysScheduleDao {

    @Override
    public int addSchedule(SysSchedule schedule) {
        String sql="insert into sys_schedule values(dafault,?,?,?)";
        int rows = baseUpdate(sql, schedule.getUid(), schedule.getTitle(), schedule.getCompleted());
        return rows;
    }

    @Override
    public List<SysSchedule> findAll() {
        String sql="select * from sys_schedule";
        List<SysSchedule> scheduleList = baseQuery(SysSchedule.class, sql);
        return scheduleList;
    }
}
