package com.wp.utils;

/**
 * 为脑残时
 *  翻译数据库中为int类型的数据 在app.properties中进行设置
 * Created by zhang on 2017/5/18.
 */
public class ConvertFunction {

    public static String getFormat(String str){
        return PropertyUtil.getProperty(str);
    }

    public static String getFormat(String prefix,String subfix){
        return PropertyUtil.getProperty(prefix,subfix);
    }
}
