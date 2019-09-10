package com.qfedu.entity;

import lombok.Data;

import java.io.StringReader;
import java.util.Date;

/**
 * @author ZZzz
 * @version 1.0
 * @className Applicant
 * @description TODO
 * @date 2019/9/10 14:40
 */
@Data
public class Applicant {
    private int id;
    private String name;
    private String headurl;
    private String position;
    private String phone;
    private Date ctime;
    private String address;
}

