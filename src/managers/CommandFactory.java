package managers;

import commands.AddCommand;
import commands.AddIfMin;
import commands.Command;
import exceptions.EmptyFieldException;

import java.util.HashMap;
import java.util.function.Supplier;

public class CommandFactory {

    final static HashMap<String, Supplier<Command>> map = new HashMap<>();
    static {
        map.put("ADD", AddCommand::new);
//        map.put("ADDIFMIN", AddIfMin::new);
    }

    public Command getCommand(String commandName) throws IllegalArgumentException {
        Supplier<Command> command = map.get(commandName.toUpperCase());
        try {
            if (commandName != null) return command.get();
            if (commandName.equals("")) throw new EmptyFieldException();
        } catch (IllegalArgumentException e) {
            ConsoleManager.printerror("No such command" + commandName.toUpperCase());
        }catch (EmptyFieldException e) {
            ConsoleManager.printerror("No command entered");
        }
        return null;


//    //    Supplier<Command> commamdSupplier =
//    Supplier<Command> addCommandSupplier = AddCommand::new;
//    Command addCommand = addCommandSupplier.get();
//

    }
}
