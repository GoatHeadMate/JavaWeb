package com.GoatHeadMate.schedule.pojo;

import lombok.*;

import java.io.Serializable;

/**
 * Author: GoatHead Mate
 * DATA: 2024/7/29-07-29-上午10:06
 * Description: com.GoatHeadMate.schedule.pojo
 * Version: 1.0
 */

/**
 * 使用lombok生成
 * 使用步骤：
 *      1、检查是否安装了插件
 *      2、检查是否勾选了 enable annotation processing
 *      3、导入lombok的依赖
 *      4、在实体类上添加注解
 */

@AllArgsConstructor  //添加了全参构造
@NoArgsConstructor   //添加无参构造
@Data
public class SysUser implements Serializable {
    private Integer uid;
    private String username;
    private String userPwd;
}
