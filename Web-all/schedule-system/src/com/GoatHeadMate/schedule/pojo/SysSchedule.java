package com.GoatHeadMate.schedule.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Author: GoatHead Mate
 * DATA: 2024/7/29-07-29-上午10:32
 * Description: com.GoatHeadMate.schedule.pojo
 * Version: 1.0
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class SysSchedule implements Serializable {
    private Integer sid;
    private Integer uid;
    private String title;
    private Integer completed;
}
