package com.qfedu.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author ZZzz
 * @version 1.0
 * @className ApplicantDetail
 * @description TODO
 * @date 2019/9/10 14:42
 */
@Data
public class ApplicantDetail {

    private Integer id;
    /*
     * 1 女  2 男
     */
    private Integer sex;
    private Integer workyear;
    private Date birthday;
    private String selfinfo;
    private String selfpower;
    private String education;
    private Integer aid;

}
