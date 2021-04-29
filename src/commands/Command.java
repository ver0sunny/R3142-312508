package commands;

import exceptions.CollectionIsEmptyException;
import exceptions.WrongScriptInputException;

public interface Command {
    boolean execute(String arg);
    String getName();
    String getDescription();
}
