package com.wp.restuarant.adminer.controller;

import com.wp.restuarant.data.emp.dao.EmpDao;
import com.wp.restuarant.data.emp.entity.Emp;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * 员工管理
 * Created by zwp on 17-4-15.
 */
@Controller
@RequestMapping("/admin/emp")
public class EmpController {

    private static final Logger logger=Logger.getLogger(EmpController.class);

    @Autowired
    private EmpDao empDao;

    /**
     * 查找员工信息
     * @return
     */
    @RequestMapping(value = "/find",method = RequestMethod.GET)
    public String find(Model model){
        List<Emp> list=empDao.select();
        model.addAttribute("list",list);
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
     * 提交表格信息
     * @param emp
     * @return
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(Emp emp){
        empDao.insert(emp);
        return "/service/success";
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
     *
     */
    @RequestMapping(value = "/toAddBatch", method = RequestMethod.POST)
    public String addBath(MultipartFile file){

        return "service/success";
    }


    /**
     * 修改员工信息
     * @return
     */

    @RequestMapping(value = "/update",method = RequestMethod.GET)
    public String update(Integer id,Model model){
        Emp emp=empDao.selectById(id);
        model.addAttribute("emp",emp);
        return "/service/emp/update";
    }

    @RequestMapping(value = "/toUpdate",method = RequestMethod.POST)
    public String update(Emp emp){
        empDao.update(emp);
        return "/service/success";
    }

    /**
     * 删除员工信息
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public String delete(Integer id){
        empDao.delete(id);
        return "/service/success";
    }
}
