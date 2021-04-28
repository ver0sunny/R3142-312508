package managers;

import commands.AddCommand;
import commands.AddIfMin;
import commands.Command;
import exceptions.EmptyFieldException;
import exceptions.WrongScriptInputException;

import java.util.HashMap;
import java.util.function.Supplier;

public class CommandFactory {

    public final static HashMap<String, Supplier<Command>> map = new HashMap<>();

    static {
        map.put("ADD", AddCommand::new);
//        map.put("ADDIFMIN", AddIfMin::new);
    }

    public Command getCommand(String commandName) throws IllegalArgumentException {
        Supplier<Command> command = map.get(commandName.toUpperCase());
        try {
            return command.get();
        } catch (IllegalArgumentException e) {
            ConsoleManager.printerror("No such command" + commandName.toUpperCase());
        }
        return null;


//    //    Supplier<Command> commamdSupplier =
//    Supplier<Command> addCommandSupplier = AddCommand::new;
//    Command addCommand = addCommandSupplier.get();
//

    }
}
