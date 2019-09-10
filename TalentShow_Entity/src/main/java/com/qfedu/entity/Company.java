package com.qfedu.entity;

import lombok.Data;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.Date;

/**
 * @author ZZzz
 * @version 1.0
 * @className Company
 * @description TODO
 * @date 2019/9/10 14:42
 */
@Data
public class Company {

    private Integer id;
    private String name;
    private String duty;
    private Date startTime;
    private Date endTime;
    private String workContent;
    /**
     *  薪水  月薪，  单位：元
     */
    private Integer salary;
    private Integer aid;

}
