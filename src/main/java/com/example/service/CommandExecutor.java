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

//    public String insert() {
//        return insert.execute();
//    }

    public ModelAndView insert() {
        model = new ModelAndView();
        model.setViewName(insert.execute());
        model.addObject("message", insert.execute());
        return model;
    }

//    public String update() {
//        return update.execute();
//    }

    public ModelAndView update() {
        model = new ModelAndView();
        model.setViewName(update.execute());
        model.addObject("message", insert.execute());
        return model;
    }

//    public String select() {
//        return select.execute();
//    }

    public ModelAndView select() {
        model = new ModelAndView();
        model.setViewName(select.execute());
        model.addObject("message", select.execute());
        return model;
    }

//    public String delete() {
//        return  delete.execute();
//    }

    public ModelAndView delete() {
        model = new ModelAndView();
        model.setViewName(delete.execute());
        model.addObject("message", delete.execute());
        return model;
    }
}
