package com.yulian.manage.controller.module1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ModuleController {

    @GetMapping("index")
    public String index() {
        return "test";
    }

}
