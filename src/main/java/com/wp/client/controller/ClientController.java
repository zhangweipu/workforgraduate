package com.wp.client.controller;

import com.wp.algor.WaitTime;
import com.wp.restuarant.food.dao.FoodTypeMapper;
import com.wp.restuarant.food.dao.FoodsMapper;
import com.wp.restuarant.food.entity.FoodType;
import com.wp.restuarant.food.entity.Foods;
import com.wp.restuarant.order.dao.OrderMapper;
import com.wp.restuarant.order.entity.Order;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by admin on 2016/10/5.
 */
@Controller
@RequestMapping("/client")
public class ClientController {

    private static final Logger logger=Logger.getLogger(ClientController.class);
    @Autowired
    private FoodsMapper foodsMapper;

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private FoodTypeMapper foodTypeMapper;

    @Autowired
    private WaitTime waitTime;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(ModelMap modelMap){
        //todo：等待添加
        //先整十张桌子
        modelMap.addAttribute("id",10);
        return "client/main";
    }

//    @RequestMapping(value = "/addOrder",method = RequestMethod.POST)
//    public String addOrder(@RequestBody Str str){
//       // System.out.print(str.toString());还是通过对象获取数据简单
////        JSONArray jsonArray;
////        jsonArray = new JSONArray("["+str+"]");
////        String a=(String)jsonArray.getJSONObject(0).get("str");//这样操作json字符中的值太麻烦
////        String a=str.getStr();
////        String b=str.getTab();
////        System.out.print(b);
////        String []s=Pattern.compile(",").split(a);
////        List<Order> list=new ArrayList<Order>();
////        for(String l:s){
////            Order o=new Order();
////            Foods food=foodsMapper.findSizePriceByName(l);
////            o.setFoodSize(food.getSize());
////            o.setFoodName(l);
//////            o.setSeatMark(str.getTab());
//////            o.setFoodStutas(1);//设置订单状态
////            o.setTime(new Date());
////            orderMapper.insert(o);//信息存储到数据库
////            list.add(o);
////        }
////        System.out.print(list.size());
//        return "client/success";//因为是使用的ajax的异步刷新所以没办法转发到指定页面
//    }

    @RequestMapping(value = "/lsOrder",method = RequestMethod.GET)
    public String lsOrder(Integer tab,ModelMap modelMap){;
        List<Order> list=orderMapper.findBySeat(tab);
        modelMap.put("list",list);
        return "client/lsOrder";
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String list(Integer tab, ModelMap modelMap,HttpServletRequest req){
        HttpSession session=req.getSession();
        //todo:添加订单号
       int id= (int) (Math.random()*1000);
        session.setAttribute("orderid",id);
        List<FoodType> typeList=foodTypeMapper.seach();
        modelMap.put("typeList",typeList);
        modelMap.put("url","/static/images/");
        modelMap.put("id",id);
        logger.info("查询菜单了");
        logger.warn("这是警告！！！！！");
        logger.debug("这是debug！！！！");
        logger.error("这是错误");
        return "client/main";
    }

    @RequestMapping("/success")
    public String doSure(Model model, HttpServletRequest request){
        HttpSession session=request.getSession();
        int id= (int) session.getAttribute("orderid");
        int time=waitTime.getTime(id);
        List<Order> orders=orderMapper.findOrder(id);
        model.addAttribute("orders",orders);
        model.addAttribute("time",time);
        return "client/success";
    }

    @RequestMapping(value = "/beginEat",method = RequestMethod.GET)
    public String beginEat(HttpServletRequest req,Model model){
        HttpSession session=req.getSession();
        Integer id=(Integer) session.getAttribute("orderid");
        List<Order> orders=orderMapper.findOrder(id);
        model.addAttribute("orders",orders);
        return "client/eat";
    }

    @RequestMapping(value = "/praise")
    @ResponseBody
    public Integer praise(Integer id){
        foodsMapper.updatePraiseNum(id);
        return foodsMapper.findPraise(id);
    }
}
