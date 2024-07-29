package com.GoatHeadMate.schedule.dao;

import com.GoatHeadMate.schedule.pojo.SysSchedule;

import java.util.List;

/**
 * Author: GoatHead Mate
 * DATA: 2024/7/29-07-29-上午11:07
 * Description: com.GoatHeadMate.schedule.dao
 * Version: 1.0
 */
public interface SysScheduleDao {
    /**
     * 该方法用于向数据库中添加增加一条日程记录
     * @param schedule 日程记录以SysSchedule实体类形式入参
     * @return 返回影响数据库记录的行数，行数为0则增加失败
     */
    int addSchedule(SysSchedule schedule);

    /**
     * 查询所有日程中的数据
     * @return 将所有日程放到一个中实现
     */
    List<SysSchedule> findAll();
}
