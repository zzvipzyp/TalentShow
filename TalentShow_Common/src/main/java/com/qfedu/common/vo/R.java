package com.qfedu.common.vo;

import lombok.Data;

/**
 * @author ZZzz
 * @version 1.0
 * @className R
 * @description 统一结果
 * @date 2019/9/10 14:26
 */

@Data
public class R<T> {
    private int code;
    private String msg;
    private T data;

}
