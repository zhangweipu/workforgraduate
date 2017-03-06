package com.wp.utils;

/**
 * Created by zhang on 2017/2/9.
 */
public class Test {
    public static void main(String[] args){
        int a=(4+2-1)/2;
        System.out.println(a);
        String b=new String("dddd");
        StringBuffer sb=new StringBuffer("bbbbbbbb");
        test1(b,sb);
        System.out.println(b);
        System.out.println(sb);
    }

    @org.junit.Test
    public void test(){
        System.out.println(this.hashCode());
    }

    public static void test1(String a,StringBuffer sb){
        a="aa";
        sb.append("bb");
    }
}
