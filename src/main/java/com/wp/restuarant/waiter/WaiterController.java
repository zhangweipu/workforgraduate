package com.wp.restuarant.waiter;

import com.wp.restuarant.data.food.dao.FoodsMapper;
import com.wp.restuarant.data.food.entity.Foods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
    public String index(){
        return "waiter/index";
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String getMenu(String type,Model model){

        List<Foods> list=foodsMapper.findByType(type);
        model.addAttribute("list",list);
        return "waiter/list";
    }
}
