package com.wp.restuarant.adminer.controller;

import com.wp.restuarant.data.food.entity.FoodType;
import com.wp.restuarant.data.food.entity.Foods;
import com.wp.restuarant.data.order.entity.Order;
import com.wp.restuarant.data.order.entity.OrderID;
import com.wp.restuarant.adminer.dao.TableTools;
import com.wp.restuarant.adminer.entity.Table;
import com.wp.restuarant.adminer.service.ServiceService;
import com.wp.utils.ChineseToPinyinUtil;
import com.wp.utils.Conditions;
import com.wp.utils.ImportMenu;
import com.wp.utils.PropertyUtil;
import net.sf.json.JSONObject;
import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 管理员服务后台，主要管理餐馆的菜单的指定等等任务
 * Created by admin on 2016/10/6.
 */
@Controller
@RequestMapping("/admin")
public class ServiceController {

    @Autowired
    private ServiceService serviceService;
    //文件上传路径
    //TODO：更改文件路径
    public final static String path= PropertyUtil.getProperty("imageUrl");

    /**
     * 菜单查询
     * @param request
     * @param modelMap
     * @return
     */
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(HttpServletRequest request,ModelMap modelMap){
        List<Foods> list=serviceService.findAll();
        List<String> urlList=new ArrayList<String>();
        for(Foods f:list) {
            //   String url=request.getContextPath()+"/images/"+f.getImageName();
            String url = "/static/images/" + f.getImageName();
            url.trim();
            urlList.add(url);
        }
        modelMap.addAttribute("urlList",urlList);
        return "service/index";
    }

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String add(){
        return "service/editmenu/add";
    }

    /**
     *
     * @param food
     * @param icon
     * @param request
     * @param modelMap
     * @return
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(Foods food, MultipartFile icon, HttpServletRequest request, ModelMap modelMap){

        byte[] bytes=food.getName().getBytes();
        String ne= ChineseToPinyinUtil.getPinYin(food.getName());
        String imageName=ne+".jpg";
        //String path = request.getSession().getServletContext().getRealPath("images");//获取服务器文件夹地址 不能长期存储 服务重启就消失

        File image=new File(path,imageName);
        if(!image.exists()){//如果不存在创建目录
            image.mkdirs();
        }
        try {
            icon.transferTo(image);
        } catch (IOException e) {
            e.printStackTrace();
        }
        food.setImageName(imageName);
        serviceService.add(food);
        modelMap.addAttribute("urlImage",path+imageName);
        return "service/index";
    }
    @RequestMapping(value = "/addmany",method = RequestMethod.GET)
    public String toaddmany(){
        return "service/editmenu/addMany";
    }

    /**
     *
     * @param file
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/addmany",method = RequestMethod.POST)
    public String addmany(MultipartFile file ) throws IOException {

        InputStream in=file.getInputStream();
       List<Foods> foodsList=ImportMenu.readExcel(in);
       serviceService.addFoods(foodsList);
//        System.out.println(foodsList.size());
        return "service/index";
    }

    /**
     *
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/down",method = RequestMethod.GET)
    public ResponseEntity<byte[]> downMould() throws IOException{
        String path="d://food.xlsx";
        File file=new File(path);
        HttpHeaders httpHeaders = new HttpHeaders();
        String fileName=new String("菜单模板.xlsx".getBytes("UTF-8"),"iso-8859-1");
        httpHeaders.setContentDispositionFormData("attachment",fileName);
        httpHeaders.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),httpHeaders, HttpStatus.CREATED);
    }

    /**
     *
     * @param modelMap
     * @param conditions
     * @return
     */
    @RequestMapping(value="/list",method = RequestMethod.GET)
    public String list(ModelMap modelMap, Conditions conditions){
        if(conditions.getPage()==null||conditions.getPage()==0){
            conditions.setPage(1);
        }
        int currentPage=conditions.getPage();
        conditions.setPage(currentPage-1);
        //求总页数的公式
        int pageCount=(serviceService.foodCount()+20-1)/20;
        List<Foods> list=serviceService.findPage(conditions);
        //conditions.setPageCount(pageCount);
        modelMap.addAttribute("list",list);
        modelMap.addAttribute("currentPage",currentPage);
        modelMap.addAttribute("pageCount",pageCount);
        modelMap.addAttribute("url","/admin/list");
        return "service/editmenu/list";
    }

    /**
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.GET)
    public String update(Integer id, Model model){
        Foods food=serviceService.findById(id);
        model.addAttribute("food",food);
        return "service/editmenu/update";
    }

    /**
     *
     * @param food
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String update(Foods food){
        serviceService.update(food);
        return "redirect:/admin/index";
    }

    /**
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public String delete(Integer id){
        Foods food=serviceService.findById(id);
        String imageName=food.getImageName();
        if(imageName!=null){//删除图片文件
            File file=new File(path+imageName);
            if(file.exists()){
                file.delete();
            }
        }
        serviceService.delete(id);//删除数据库信息
        return "redirect:/admin/list";
    }

    @RequestMapping(value = "/showOrder",method = RequestMethod.GET)
    public String showOrder(ModelMap modelMap){
        List<OrderID> list=serviceService.findAllorderId();
        modelMap.put("list",list);
        return "service/findorder/orderlist";
    }

    @RequestMapping(value = "/orderList",method = RequestMethod.GET)
    public String toOrderList() {

        return "service/findorder/orderlist";
    }

    /**
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/orderdetail",method = RequestMethod.GET)
    public String orderDetial(int id,Model model){
       // Integer id=getId(request);
        List<Order> list=serviceService.findOrderDetail(id);
        model.addAttribute("id",id);
        model.addAttribute("list",list);
        return "service/findorder/orderdetail";
    }

    @RequestMapping(value = "/addFoodType",method = RequestMethod.GET)
    public String addFoodTtype(){
        return "service/editmenu/addFoodType";
    }

    /**
     *
     * @param type
     * @return
     */
   // @ResponseBody
    @RequestMapping(value = "/addFoodType",method = RequestMethod.POST)
    public String addFoodTtype(String[] type){
       // System.out.println(foodTypes.size());
        for(int i=0;i<type.length;i++){
                FoodType foodType = new FoodType(type[i]);
                if(foodType.getType()!=null && foodType.getType()!="") {
                    serviceService.addFoodType(foodType);
                }
        }
        return "success";
    }

    /**
     *
     * @param getTable
     * @param response
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/getTable",method = RequestMethod.POST)
    public String getTable(String getTable, HttpServletResponse response) throws IOException {

        JSONObject json=JSONObject.fromObject(getTable);
        List<Map<String,String>> list=json.getJSONArray("data");
        System.out.println(list.size());
       List<Table> list1=new ArrayList<Table>();
       for(Map<String,String> map:list){
            Table table=new Table();
            table.setIndex(map.get("index"));
            table.setName(map.get("name"));
            table.setImageName(map.get("imageName"));
            table.setPrice(map.get("price"));
            table.setType(map.get("type"));
            table.setSize(map.get("size"));

            System.out.println(table);
            list1.add(table);
        }
//            Table table=new Table();
//        table.setIndex("index");
//        table.setName("name");
//        table.setImageName("image");
//        table.setPrice("price");
//        table.setType("type");
//        table.setSize("size");
//list1.add(table);
        HSSFWorkbook wb= TableTools.export(list1);
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("content-disposition", "attachment;filename=table.xls");
        OutputStream outputstream = response.getOutputStream();
        wb.write(outputstream);
        outputstream.flush();
        outputstream.close();
        return null;
    }

    private Integer getId(HttpServletRequest request){

        HttpSession session=request.getSession();
        int a=(Integer) session.getAttribute("orderid");
        return a;
    }
}
