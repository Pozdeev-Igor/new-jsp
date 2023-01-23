package com.example.service;

public class SelectCommand implements Command{

    CommandRunner commandRunner;

    public SelectCommand(CommandRunner commandRunner) {
        this.commandRunner = commandRunner;
    }

    @Override
    public String execute() {
       return commandRunner.select();
    }
}
