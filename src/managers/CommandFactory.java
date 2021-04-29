package managers;

import commands.AbstractCommand;
import commands.AddCommand;
import commands.AddIfMin;
import commands.Command;
import exceptions.EmptyFieldException;
import exceptions.WrongScriptInputException;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.function.Supplier;

public class CommandFactory {

    public final static Hashtable<String, AbstractCommand> map = new Hashtable<>();

    private CollectionManager collectionManager;
    private InputAndVerifier inputAndVerifier;
    private static AddCommand addCommand;

    public CommandFactory(CollectionManager collectionManager,InputAndVerifier inputAndVerifier, AddCommand addCommand) {
        this.inputAndVerifier = inputAndVerifier;
        this.collectionManager = collectionManager;
        this.addCommand = addCommand;
    }

    static {
        map.put("ADD", addCommand);
//        map.put("ADDIFMIN", AddIfMin::new);
    }

    public Command getCommand(String commandName) throws IllegalArgumentException {
        AbstractCommand command = map.get(commandName.toUpperCase());
        try {
            return command;
        } catch (IllegalArgumentException e) {
            ConsoleManager.printerror("No such command" + commandName.toUpperCase());
        }
        return null;
    }
}
