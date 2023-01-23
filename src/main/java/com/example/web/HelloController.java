package com.example.web;

import com.example.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    CommandExecutor executor;
    CommandRunner runner;

    @GetMapping("/hello")
    public String defaultPage(ModelMap model) {
        return "hello";
    }

    @GetMapping("/hello/{name}")
    public ModelAndView hello(@PathVariable("name") String name) {
        ModelAndView model = new ModelAndView();
        runner = new CommandRunner();
        executor = new CommandExecutor(
                new InsertCommand(runner),
                new DeleteCommand(runner),
                new UpdateCommand(runner),
                new SelectCommand(runner));

        return executor.result(name);
    }
}