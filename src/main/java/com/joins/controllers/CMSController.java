package com.joins.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by joins on 2017. 6. 27..
 */
@Controller
@RequestMapping("/cms")
public class CMSController {

    @RequestMapping("/main")
    public void main(Model model){
        model.addAttribute("msg", "This is CMS Main");
    }
}
