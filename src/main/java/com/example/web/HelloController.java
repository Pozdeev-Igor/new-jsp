package com.example.web;

import com.example.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.io.FileNotFoundException;

@Controller
public class HelloController {

    CommandRunner runner;
    CommandExecutor executor;

    //@RequestMapping(value = "/", method = RequestMethod.GET)
    @GetMapping("/hello")
    public String defaultPage(ModelMap model) {
        return "hello";
    }

    //@RequestMapping(value = "/hello/{name:.+}", method = RequestMethod.GET)
    @GetMapping("/hello/{name}")
    public ModelAndView hello(@PathVariable("name") String name) {

        runner = new CommandRunner();
        executor = new CommandExecutor(new InsertCommand(runner),
                new DeleteCommand(runner),
                new UpdateCommand(runner),
                new SelectCommand(runner));


        ModelAndView model = new ModelAndView();
        model.setViewName(name);
        model.addObject("message", name);
        return model;
    }
}