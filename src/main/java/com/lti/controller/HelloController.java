package com.lti.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloController {

    
    
    private int i = 0;
    @RequestMapping("/")
    public ModelAndView hellopage() {
       return new ModelAndView("hellopage",new HashMap<>());
    }
        @RequestMapping("/hello")
    public ModelAndView sayHello() {
        i++;
        ModelAndView mv = new ModelAndView("hellopage",
                "message", "Hello request count=" + i);
        return mv;
    }
}
   














