package com.example.service;

public class UpdateCommand implements Command {

    CommandRunner commandRunner;

    public UpdateCommand(CommandRunner commandRunner) {
        this.commandRunner = commandRunner;
    }

    @Override
    public String execute() {
        return commandRunner.update();
    }
}
