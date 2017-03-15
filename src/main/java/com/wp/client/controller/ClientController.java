package com.wp.client.controller;

import com.wp.client.entity.Str;
import com.wp.food.dao.foodsMapper;
import com.wp.food.entity.foods;
import com.wp.order.dao.OrderMapper;
import com.wp.order.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by admin on 2016/10/5.
 */
@Controller
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private foodsMapper foodsMapper;

    @Autowired
    private OrderMapper orderMapper;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(ModelMap modelMap){
        //先整十张桌子
        modelMap.addAttribute("id",10);
        return "client/main";
    }

    @RequestMapping(value = "/addOrder",method = RequestMethod.POST)
    public String addOrder(@RequestBody Str str){
       // System.out.print(str.toString());还是通过对象获取数据简单
//        JSONArray jsonArray;
//        jsonArray = new JSONArray("["+str+"]");
//        String a=(String)jsonArray.getJSONObject(0).get("str");//这样操作json字符中的值太麻烦
//        String a=str.getStr();
//        String b=str.getTab();
//        System.out.print(b);
//        String []s=Pattern.compile(",").split(a);
//        List<Order> list=new ArrayList<Order>();
//        for(String l:s){
//            Order o=new Order();
//            foods food=foodsMapper.findSizePriceByName(l);
//            o.setFoodSize(food.getSize());
//            o.setFoodName(l);
////            o.setSeatMark(str.getTab());
////            o.setFoodStutas(1);//设置订单状态
//            o.setTime(new Date());
//            orderMapper.insert(o);//信息存储到数据库
//            list.add(o);
//        }
//        System.out.print(list.size());
        return "client/lsOrder";//因为是使用的ajax的异步刷新所以没办法转发到指定页面
    }

    @RequestMapping(value = "/lsOrder",method = RequestMethod.GET)
    public String lsOrder(Integer tab,ModelMap modelMap){;
        List<Order> list=orderMapper.findBySeat(tab);
        modelMap.put("list",list);
        return "client/lsOrder";
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String list(Integer tab, ModelMap modelMap){
        List<foods> foodsList=foodsMapper.findAll();
        modelMap.put("foodList",foodsList);
        modelMap.put("url","/static/images/");
        return "client/main";
    }

    @RequestMapping("/sure")
    public String doSure(){
        return "client/sure";
    }
}
