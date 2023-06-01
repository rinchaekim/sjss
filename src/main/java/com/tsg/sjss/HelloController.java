package com.tsg.sjss;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/")
    public String home(Model model){
        model.addAttribute("testSTR","타임리프 사용하기");
        return "testView";
    }
}
