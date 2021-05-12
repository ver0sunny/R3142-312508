package managers;

import commands.AbstractCommand;
import commands.Command;
import exceptions.*;

import java.sql.SQLOutput;
import java.util.function.Supplier;

public class CommandManager {

    private CollectionManager collectionManager;
    private CommandFactory commandFactory;
    private InputAndVerifier inputAndVerifier;
    private HistoryManager historyManager;

    public CommandManager(HistoryManager historyManager, CollectionManager collectionManager, CommandFactory commandFactory, InputAndVerifier inputAndVerifier) {
        this.commandFactory = commandFactory;
        this.collectionManager = collectionManager;
        this.inputAndVerifier = inputAndVerifier;
        this.historyManager = historyManager;
    }

    public void execute(String commandName, String arg) throws NoSuchCommandException {
        try {
            if (arg.equals(null)) throw new NoArgumentProvidedException();
            commandFactory.getCommand(commandName).execute(arg);
            historyManager.addToHistory(commandName);
        } catch (NoArgumentProvidedException e) {
            ConsoleManager.printerror("No argument provided, check requirements " + commandFactory.getCommand(commandName).getName());
        } catch (NoSuchCommandException e) {
            ConsoleManager.printerror("No such command exists, check available commands" + commandFactory.getCommand("HELP").execute(""));
        }
    }
}
