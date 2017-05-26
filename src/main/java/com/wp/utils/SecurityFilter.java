package com.wp.utils;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 实现鉴权进行的设置
 * 现在是借鉴网上的例子
 * Created by zwp on 17-5-18.
 */
public class SecurityFilter extends OncePerRequestFilter{

    @Override
    protected void doFilterInternal(HttpServletRequest Req, HttpServletResponse Resp, FilterChain Chain) throws ServletException, IOException {
        //不过滤的uri
        String[] notFilter=new String[]{"/static","/views","/js","/main","/test","/client"};

        //请求的uri
        String uri=Req.getRequestURI();
        String path=Req.getContextPath();
        //是否过滤
        boolean doFilter=true;
        for(String s:notFilter){
            if(uri.indexOf(s)!=-1){
                //就是匹配文件路径吧
                doFilter=false;
                break;
            }
        }
        if(doFilter){
            //执行过滤
            //从session中获取登录信息
            Object obj=Req.getSession().getAttribute("USER");
            if(null==obj){
                boolean isAjaxRequest=isAjaxRequest(Req);
                if(isAjaxRequest){
                    Resp.setCharacterEncoding("UTF-8");
                    Resp.sendError(00,"请重新登录");
                    return;
                }
                Resp.sendRedirect(path+"/main");
                return;
            }else{
                //放行
                Chain.doFilter(Req,Resp);
            }
        }else {
            Chain.doFilter(Req,Resp);
        }
    }


    public boolean isAjaxRequest(HttpServletRequest req){
        String header=req.getHeader("X-Requested-With");
        if(null != header && "XMLHttpRequest".equals(header)){
            return true;
        }else {
            return false;
        }
    }
}
