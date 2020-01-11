package com.chen.damo.util;

import java.util.UUID;

/**
 * @Description //生成主键工具类
 * @Author weixiaodong
 * @Date 2019/7/1315:11
 **/
public class UUIDUtli {
    public static String createId(){
        return  UUID.randomUUID().toString().replaceAll("-","");
    }

}
