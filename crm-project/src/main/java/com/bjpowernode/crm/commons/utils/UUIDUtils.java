package com.bjpowernode.crm.commons.utils;

import java.util.UUID;

public class UUIDUtils {
    /**返回uuid的值
     * @return uuid字符串
     */
    public static String getUUID(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
