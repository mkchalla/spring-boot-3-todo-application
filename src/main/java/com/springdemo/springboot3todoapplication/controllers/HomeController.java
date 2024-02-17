package com.springdemo.springboot3todoapplication.controllers;

import com.springdemo.springboot3todoapplication.services.TodoItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {


    @Autowired
    private TodoItemService todoItemService;

    @GetMapping("/")
    public String index(Model model){
//        ModelAndView modelAndView = new ModelAndView("index");

//        modelAndView.addObject("todoItems", todoItemService.getAll());

        model.addAttribute("todoItems", todoItemService.getAll());

        return "index";
    }
}
