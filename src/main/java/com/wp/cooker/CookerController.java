package com.wp.cooker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by admin on 2016/10/13.
 */
@Controller
@RequestMapping("/cooker")
public class CookerController {

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String List(){

        return "cooker/list";
    }
}
