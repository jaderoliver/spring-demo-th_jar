package com.example.springdemo.web;

import java.util.Arrays;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author willesreis
 */
@Controller
public class WelcomeController {

    @GetMapping("/")
    public ModelAndView welcome() {
        ModelAndView view = new ModelAndView("welcome");
        view.addObject("message", "Hello World!");
	view.addObject("instructions", Arrays.asList("First, click on button to get all users", "Next, type in search to filter rows in table"));
        return view;
    }

    @GetMapping("/datatable")
    public ModelAndView data() {
        ModelAndView view = new ModelAndView("datatable");
        view.addObject("instructions", Arrays.asList("First, look at data comming from server", "Next, interact with datatable and be happy"));
        return view;
    }

}
