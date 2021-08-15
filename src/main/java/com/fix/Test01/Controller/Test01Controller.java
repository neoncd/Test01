package com.fix.Test01.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Test01Controller {
    @GetMapping
    public String index(){
        return "index";

    }
}
