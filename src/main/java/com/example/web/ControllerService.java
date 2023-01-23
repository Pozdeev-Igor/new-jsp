package com.example.web;

import com.example.service.*;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class ControllerService {

    CommandRunner runner;
    CommandExecutor executor;

    public ModelAndView runMethod(String name) {
        runner = new CommandRunner();
        executor = new CommandExecutor(new InsertCommand(runner),
                new DeleteCommand(runner),
                new UpdateCommand(runner),
                new SelectCommand(runner));

        ModelAndView model = new ModelAndView();

        switch (name) {
            case "insert":
                return executor.insert();
            case "update":
                return executor.update();
            case "select":
                return executor.select();
            case "delete":
                return executor.delete();
            default:
                model.setViewName("error");
                return model;
        }
    }
}
