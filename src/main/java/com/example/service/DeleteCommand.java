package com.example.service;

public class DeleteCommand implements Command{

    CommandRunner commandRunner;

    public DeleteCommand(CommandRunner commandRunner) {
        this.commandRunner = commandRunner;
    }

    @Override
    public String execute() {
       return commandRunner.delete();
    }
}
