package com.example.service;

public class InsertCommand implements Command {

    CommandRunner commandRunner;

    public InsertCommand(CommandRunner commandRunner) {
        this.commandRunner = commandRunner;
    }

    @Override
    public String execute() {
       return commandRunner.insert();
    }
}
