package managers;

import commands.AbstractCommand;
import exceptions.NoArgumentProvidedException;
import exceptions.NoElementWithSuchIdException;
import exceptions.WrongScriptInputException;

import java.sql.SQLOutput;
import java.util.function.Supplier;

public class CommandManager {

    private CollectionManager collectionManager;
    private CommandFactory commandFactory;
    private InputAndVerifier inputAndVerifier;

    public CommandManager(CollectionManager collectionManager, CommandFactory commandFactory, InputAndVerifier inputAndVerifier) {
        this.commandFactory = commandFactory;
        this.collectionManager = collectionManager;
        this.inputAndVerifier = inputAndVerifier;
    }

    private final int historyLenghth = 12;
    private String[] commandHistory = new String[historyLenghth];

    public void addToHistory() {
    }

    public String[] getCommandHistory() {
        return commandHistory;
    }


    public void execute(String commandName, String arg) {
        try {
        if (arg == "") throw new NoArgumentProvidedException();
        commandFactory.getCommand(commandName).execute(arg);
        } catch (NoArgumentProvidedException e) {
            ConsoleManager.printerror("No argument provided, check requirements" + commandFactory.getCommand(commandName).getName());
        }
    }
}
