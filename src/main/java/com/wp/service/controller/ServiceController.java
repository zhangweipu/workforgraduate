package com.wp.service.controller;

import com.wp.food.entity.foods;
import com.wp.service.service.ServiceService;
import com.wp.service.service.serviceImpl.ServiceServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.List;

/**
 * Created by admin on 2016/10/6.
 */
@Controller
@RequestMapping("/service")
public class ServiceController {

    @Autowired
    private ServiceService serviceService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "service/index";
    }

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String add(){
        return "service/add";
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(foods food){
        System.out.print(food);
        serviceService.add(food);
        return "service/index";
    }

    @RequestMapping(value="/list",method = RequestMethod.GET)
    public String list(ModelMap modelMap){
        List<foods> list=serviceService.findAll();
        modelMap.addAttribute("list",list);
        return "service/list";
    }

    @RequestMapping(value = "/update",method = RequestMethod.GET)
    public String update(Integer id, Model model){
        foods food=serviceService.findById(id);
        model.addAttribute("food",food);
        return "service/update";
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String update(foods food){
        System.out.print(food);
        System.out.print("sss");
        serviceService.update(food);
        return "redirect:/service/index";
    }

    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public String delete(Integer id){
        serviceService.delete(id);
        return "redirect:/service/list";
    }
}
