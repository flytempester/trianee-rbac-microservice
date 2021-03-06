package com.bosssoft.springcloud.entity.po;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * @author 张东海
 * @date 2020/7/26
 * @description
 */
@Data
public class MenuInfoPO {
    @Id
    private Integer id;
    @Column
    private String name;
    @Column
    private LocalDateTime createTime;
    @Column
    private LocalDateTime updateTime;
}
