package com.example.demo.controllers;


import com.example.demo.constant.ViewConstant;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class InicioController {

    @GetMapping("/inicio")
    public String inicio(){ return ViewConstant.INDEX; }

    @GetMapping("/inicio2")
    public String inicio2(){ return ViewConstant.INDEX2; }

    @GetMapping({"/","/login"})
    public String index() {
        return "index";
    }


    @GetMapping("/user")
    public String user() {
        return ViewConstant.INDEX;
    }

    @GetMapping("/admin")
    public String admin() {
        return ViewConstant.INDEX2;
    }
}
