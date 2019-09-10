package com.qfedu.common.util;

import com.qfedu.common.config.Renum;
import com.qfedu.common.vo.R;

/**
 * @author ZZzz
 * @version 1.0
 * @className RUtil
 * @description TODO
 * @date 2019/9/10 14:27
 */
public class RUtil {
    /**
     * 设置成功
     * @param msg
     * @param obj
     * @param <T>
     * @return
     */
    public static <T> R setOK(String msg, T obj) {
        R<T> r = new R<>();
        r.setCode(Renum.SUCCESS.getCode());
        r.setMsg(msg);
        r.setData(obj);
        return r;
    }

    public static <T> R setOK(String msg) {
        R<T> r = new R<>();
        r.setCode(Renum.SUCCESS.getCode());
        r.setMsg(msg);
        r.setData(null);
        return r;
    }

    public static <T> R setOK() {
        R<T> r = new R<>();
        r.setCode(Renum.SUCCESS.getCode());
        r.setMsg("OK");
        r.setData(null);
        return r;
    }

    public static <T> R setERROR(String msg, T obj) {
        R<T> r = new R<>();
        r.setCode(Renum.ERROR.getCode());
        r.setMsg(msg);
        r.setData(obj);
        return r;
    }
    public static <T> R setERROR(String msg) {
        R<T> r = new R<>();
        r.setCode(Renum.ERROR.getCode());
        r.setMsg(msg);
        r.setData(null);
        return r;
    }
    public static <T> R setERROR() {
        R<T> r = new R<>();
        r.setCode(Renum.ERROR.getCode());
        r.setMsg("ERROR");
        r.setData(null);
        return r;
    }

    public static <T> R setR(boolean issuccess,String msg){
        return issuccess ? setOK(msg) : setERROR(msg);
    }



}
