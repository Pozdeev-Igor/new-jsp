package com.example.service;

import org.springframework.web.servlet.ModelAndView;

public class CommandExecutor {

    Command insert;
    Command update;
    Command select;
    Command delete;

    ModelAndView model;

    public CommandExecutor(Command insert, Command update, Command select, Command delete) {
        this.insert = insert;
        this.update = update;
        this.select = select;
        this.delete = delete;
    }

    public ModelAndView result(String name) {
        model = new ModelAndView();
        if (name.equals("delete") || name.equals("select")
                || name.equals("update") || name.equals("insert")) {
            model.setViewName(name);
            model.addObject("message", name);
            return model;
        } else {
            model.setViewName("error");
            model.addObject("message", name);
            return model;
        }
    }
}
