package com.example.hoge.select;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String homeDisp() {
        return "home";
    }

    @GetMapping("/sheet")
    public String sheet() {
        return "sheet";
    }
}