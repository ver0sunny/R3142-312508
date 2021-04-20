package commands;

import exceptions.WrongScriptInputException;

public interface Command {
    boolean execute() throws WrongScriptInputException;
    String getName();
    String getDescription();
}
