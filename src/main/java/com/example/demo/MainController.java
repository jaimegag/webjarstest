package com.example.demo;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jaguilar on 4/10/18.
 */
public class MainController {
    @RequestMapping(value = "/")
    public String index(Model model) {
        return "index";
    }
}
