package com.joins.controllers;

import com.joins.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by joins on 2017. 6. 27..
 */
@Controller
@RequestMapping("/cms")
public class CMSController {

    @Autowired
    UserMapper mapper;

    @RequestMapping("/main")
    public void main(Model model) throws Exception {
        mapper.insert();
        model.addAttribute("msg", "This is CMS Main : " + mapper.select());
    }
}
