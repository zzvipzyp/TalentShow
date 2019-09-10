package com.qfedu.common.dto;

import lombok.Data;

import java.util.Date;

/**
 * @author ZZzz
 * @version 1.0
 * @className ApplicantDetailDto
 * @description TODO
 * @date 2019/9/10 20:42
 */
@Data
public class ApplicantDetailDto {

    /*
     * 1 女  2 男
     */
    private Integer gender;
    private Integer years;
    private Date birthday;
    private String myInfo;
    private String myAbility;
    private String education;
    private Integer aid;

}
