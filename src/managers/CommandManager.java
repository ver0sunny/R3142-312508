package managers;

import commands.AbstractCommand;
import exceptions.WrongScriptInputException;

import java.sql.SQLOutput;
import java.util.function.Supplier;

public class CommandManager {

    private String commandName;

    public CommandManager() {
    }

    Supplier<CommandFactory> commandFactory = CommandFactory::new;

    private final int historyLenghth = 12;
    private String[] commandHistory = new String[historyLenghth];

    public void addToHistory() {
    }

    public String[] getCommandHistory() {
        return commandHistory;
    }


    public void execute(String commandName) throws WrongScriptInputException {
        this.commandName = commandName;
        try {
            commandFactory.get().getCommand(commandName).execute();
        } catch (WrongScriptInputException e) {
            ConsoleManager.printerror("Something went wrong");
        }
    }
}
