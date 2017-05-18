package com.wp.utils;


import org.apache.log4j.Logger;

import java.io.*;
import java.util.Properties;

/**
 * 读取properties文件采用文件流的方式
 * 其中使用字节流的方式会出现乱码
 * 使用reader进行转一下就可以
 * Created by zwp on 17-4-30.
 */
public class PropertyUtil {
    private static final Logger logger=Logger.getLogger(PropertyUtil.class);

    private static Properties pro;

    static {
        loadProp();
    }

   private static synchronized void loadProp(){
        logger.info("开始加载.....");
        pro=new Properties();
       InputStream in=null;
       try{
           //通过类加载器加载properties文件
           in=PropertyUtil.class.getClassLoader().getResourceAsStream("app.properties");
           BufferedReader reader=new BufferedReader(new InputStreamReader(in,"UTF-8"));
           pro.load(reader);
       }catch(FileNotFoundException f){
           logger.error("没有找到文件",f);
       }catch (Exception e){
           logger.debug("出现异常.....");
       }finally{
           try {
               in.close();
           } catch (IOException e) {
              logger.error("关闭文件流出错.....");
           }
       }
       logger.info("加载完毕");
   }

    public static String getProperty(String key){
       if(null==pro){
           loadProp();
       }
       return pro.getProperty(key);
    }

    public static String getProperty(String prefix,String subfix){
        if(null==pro){
            loadProp();
        }
        return pro.getProperty(prefix+"."+subfix);
    }
}

