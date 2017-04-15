package com.wp.restuarant.adminer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 员工管理
 * Created by zwp on 17-4-15.
 */
@Controller
@RequestMapping("/admin/emp")
public class EmpController {

    /**
     * 查找员工信息
     * @return
     */
    @RequestMapping(value = "/find",method = RequestMethod.GET)
    public String find(){
        return "/service/emp/find";
    }


    /**
     * 添加员工信息
     * @return
     */
    @RequestMapping(value = "/add" ,method = RequestMethod.GET)
    public String add(){
        return "/service/emp/add";
    }

    /**
     * 批量添加员工信息
     * @return
     */
    @RequestMapping(value = "/addBatch",method = RequestMethod.GET)
    public String addBatch(){
        return "/service/emp/addBatch";
    }

    /**
     * 修改员工信息
     * @return
     */

    @RequestMapping(value = "/update",method = RequestMethod.GET)
    public String update(){
        return "/service/emp/update";
    }

    /**
     * 删除员工信息
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public String delete(){
        return "/service/emp/delete";
    }
}
