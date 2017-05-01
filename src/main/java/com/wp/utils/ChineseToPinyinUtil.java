package com.wp.utils;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import org.apache.log4j.Logger;

/**
 * 汉字转化成汉语拼音
 * 使用一个hanyupinyin的包
 * Created by zwp on 17-5-1.
 */
public class ChineseToPinyinUtil {
    private static final Logger logger=Logger.getLogger(ChineseToPinyinUtil.class);

    private static String result="";


    private static String change(String str){

        logger.info("开始转换.....");
        char[] temp=str.toCharArray();

        HanyuPinyinOutputFormat defaultFormat=new HanyuPinyinOutputFormat();
        defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
        defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);

        for(int i=0;i<temp.length;i++){

            if(temp[i]>128){
                try{
                    result+= PinyinHelper.toHanyuPinyinStringArray(temp[i],defaultFormat)[0];
                }catch(Exception e){
                    logger.error("出错了......");
                }
            }
        }
        return result;
    }

    public static String getPinYin(String hanyin){
        return change(hanyin);
    }

}
