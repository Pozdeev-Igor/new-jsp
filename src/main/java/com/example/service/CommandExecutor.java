package com.example.service;

public class CommandExecutor {

    Command insert;
    Command update;
    Command select;
    Command delete;

    public CommandExecutor(Command insert, Command update, Command select, Command delete) {
        this.insert = insert;
        this.update = update;
        this.select = select;
        this.delete = delete;
    }

    public String insert() {
        return insert.execute();
    }

    public String update() {
        return update.execute();
    }

    public String select() {
        return select.execute();
    }

    public String delete() {
        return  delete.execute();
    }
}
