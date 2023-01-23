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

    public ModelAndView insert() {
        model = new ModelAndView();
        model.setViewName(insert.execute());
        model.addObject("message", model.getViewName());
        return model;
    }

    public ModelAndView update() {
        model = new ModelAndView();
        model.setViewName(update.execute());
        model.addObject("message", model.getViewName());
        return model;
    }

    public ModelAndView select() {
        model = new ModelAndView();
        model.setViewName(select.execute());
        model.addObject("message", model.getViewName());
        return model;
    }

    public ModelAndView delete() {
        model = new ModelAndView();
        model.setViewName(delete.execute());
        model.addObject("message", model.getViewName());
        return model;
    }

    public ModelAndView result(String name) {
        model = new ModelAndView();
        if (name.equals(delete.toString()) || name.equals(select.toString())
                || name.equals(update.toString()) || name.equals(insert.toString())) {
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
