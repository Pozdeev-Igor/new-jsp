package com.example.service;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.ModelAndView;

class CommandExecutorTest {

    @Test
    void testConstructor() {
        DeleteCommand deleteCommand = new DeleteCommand(new CommandRunner());
        DeleteCommand deleteCommand1 = new DeleteCommand(new CommandRunner());
        DeleteCommand deleteCommand2 = new DeleteCommand(new CommandRunner());
        DeleteCommand deleteCommand3 = new DeleteCommand(new CommandRunner());
        CommandExecutor actualCommandExecutor = new CommandExecutor(deleteCommand, deleteCommand1, deleteCommand2,
                deleteCommand3);

        Command command = actualCommandExecutor.delete;
        assertTrue(command instanceof DeleteCommand);
        Command command1 = actualCommandExecutor.update;
        assertTrue(command1 instanceof DeleteCommand);
        Command command2 = actualCommandExecutor.insert;
        assertTrue(command2 instanceof DeleteCommand);
        Command command3 = actualCommandExecutor.select;
        assertTrue(command3 instanceof DeleteCommand);
        assertNull(actualCommandExecutor.model);
        assertSame(deleteCommand2.commandRunner, ((DeleteCommand) command3).commandRunner);
        assertSame(deleteCommand3.commandRunner, ((DeleteCommand) command).commandRunner);
        assertSame(deleteCommand.commandRunner, ((DeleteCommand) command2).commandRunner);
        assertSame(deleteCommand1.commandRunner, ((DeleteCommand) command1).commandRunner);
    }

    @Test
    void testResult() {
        DeleteCommand insert = new DeleteCommand(new CommandRunner());
        DeleteCommand update = new DeleteCommand(new CommandRunner());
        DeleteCommand select = new DeleteCommand(new CommandRunner());
        CommandExecutor commandExecutor = new CommandExecutor(insert, update, select,
                new DeleteCommand(new CommandRunner()));
        ModelAndView actualResultResult = commandExecutor.result("Name");
        assertSame(commandExecutor.model, actualResultResult);
        assertTrue(actualResultResult.isReference());
        assertSame(actualResultResult.getModel(), actualResultResult.getModelMap());
        assertSame(actualResultResult, commandExecutor.model);
    }

    @Test
    void testResult2() {
        DeleteCommand insert = new DeleteCommand(new CommandRunner());
        DeleteCommand update = new DeleteCommand(new CommandRunner());
        DeleteCommand select = new DeleteCommand(new CommandRunner());
        CommandExecutor commandExecutor = new CommandExecutor(insert, update, select,
                new DeleteCommand(new CommandRunner()));
        ModelAndView actualResultResult = commandExecutor.result("delete");
        assertSame(commandExecutor.model, actualResultResult);
        assertTrue(actualResultResult.isReference());
        assertSame(actualResultResult.getModel(), actualResultResult.getModelMap());
        assertSame(actualResultResult, commandExecutor.model);
    }


    @Test
    void testResult3() {
        DeleteCommand insert = new DeleteCommand(new CommandRunner());
        DeleteCommand update = new DeleteCommand(new CommandRunner());
        DeleteCommand select = new DeleteCommand(new CommandRunner());
        CommandExecutor commandExecutor = new CommandExecutor(insert, update, select,
                new DeleteCommand(new CommandRunner()));
        ModelAndView actualResultResult = commandExecutor.result("select");
        assertSame(commandExecutor.model, actualResultResult);
        assertTrue(actualResultResult.isReference());
        assertSame(actualResultResult.getModel(), actualResultResult.getModelMap());
        assertSame(actualResultResult, commandExecutor.model);
    }

    @Test
    void testResult4() {
        DeleteCommand insert = new DeleteCommand(new CommandRunner());
        DeleteCommand update = new DeleteCommand(new CommandRunner());
        DeleteCommand select = new DeleteCommand(new CommandRunner());
        CommandExecutor commandExecutor = new CommandExecutor(insert, update, select,
                new DeleteCommand(new CommandRunner()));
        ModelAndView actualResultResult = commandExecutor.result("update");
        assertSame(commandExecutor.model, actualResultResult);
        assertTrue(actualResultResult.isReference());
        assertSame(actualResultResult.getModel(), actualResultResult.getModelMap());
        assertSame(actualResultResult, commandExecutor.model);
    }

    @Test
    void testResult5() {
        DeleteCommand insert = new DeleteCommand(new CommandRunner());
        DeleteCommand update = new DeleteCommand(new CommandRunner());
        DeleteCommand select = new DeleteCommand(new CommandRunner());
        CommandExecutor commandExecutor = new CommandExecutor(insert, update, select,
                new DeleteCommand(new CommandRunner()));
        ModelAndView actualResultResult = commandExecutor.result("insert");
        assertSame(commandExecutor.model, actualResultResult);
        assertTrue(actualResultResult.isReference());
        assertSame(actualResultResult.getModel(), actualResultResult.getModelMap());
        assertSame(actualResultResult, commandExecutor.model);
    }
}

