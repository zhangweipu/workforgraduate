package com.wp.restuarant.waiter;

import com.wp.restuarant.data.food.dao.FoodsMapper;
import com.wp.restuarant.data.food.entity.Foods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by zhang on 2017/4/4.
 */
@Controller
@RequestMapping("/admin/waiter")
public class WaiterController {

    @Autowired
    private FoodsMapper foodsMapper;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(HttpServletRequest request){
        HttpSession session=request.getSession();
        if (session.getAttribute("orderid")!=null){
            session.removeAttribute("orderid");
        }
        return "waiter/index";
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String getMenu(HttpServletRequest req,String type,Model model){
        List<Foods> list=foodsMapper.findByType(type);
        model.addAttribute("list",list);
        Integer orderid=(int)(Math.random()*1000);
        String url=req.getContextPath();
        model.addAttribute("list",list);
        model.addAttribute("url",url+"/static/images/");
        model.addAttribute("orderid",orderid);
        return "waiter/list";
    }
}
