package managers;

import commands.AbstractCommand;
import exceptions.WrongScriptInputException;

import java.util.function.Supplier;

public class CommandManager {

    private String commandName;

    public CommandManager(String comandName) {
        this.commandName = comandName;
    }

    Supplier<CommandFactory> commandFactory = CommandFactory::new;

    private final int historyLenghth = 12;
    private String[] commandHistory = new String[historyLenghth];

    public void addToHistory() { }

    public String[] getCommandHistory() {
        return commandHistory;
    }


    public void execute(String commandName) throws WrongScriptInputException {
        this.commandName = commandName;
        commandFactory.get().getCommand("commandName").execute();
    }
}
