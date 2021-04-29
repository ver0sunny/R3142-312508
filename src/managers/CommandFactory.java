package managers;

import commands.*;

import java.util.Hashtable;

public class CommandFactory {

    public final static Hashtable<String, AbstractCommand> map = new Hashtable<>();

    private CollectionManager collectionManager;
    private InputAndVerifier inputAndVerifier;


    public CommandFactory(CollectionManager collectionManager, InputAndVerifier inputAndVerifier, AddCommand addCommand,
                          AddIfMinCommand addIfMinCommand, ClearCommand clearCommand, ExecuteScript executeScript,
                          Exit exit, FilterByFormOfEducationCommand filterByFormOfEducationCommand,
                          HelpCommand help, History history, InfoCommand infoCommand, InsertAtCommand insertAtCommand,
                          PrintDecendingBySemester printDecendingBySemester, RemoveByIdCommand removeByIdCommand,
                          RemoveByStudentCount removeByStudentCount, SaveCommand saveCommand, ShowCommand showCommand,
                          UpdateCommand updateCommand) {
        this.inputAndVerifier = inputAndVerifier;
        this.collectionManager = collectionManager;
        {
            map.put("ADD", addCommand);
            map.put("ADD_IF_MIN", addIfMinCommand);
            map.put("CLEAR",clearCommand);
            map.put("EXECUTE_SCRIPT", executeScript);
            map.put("EXIT", exit);
            map.put("FILTER_GREATER_THAN_BY_FORM_OF_EDUCATION", filterByFormOfEducationCommand);
            map.put("HELP", help);
            map.put("HISTORY",history);
            map.put("INFO",infoCommand);
            map.put("INSERT_AT", insertAtCommand);
            map.put("PRINT_FIELD_DESCENDING_SEMESTER_ENUM", printDecendingBySemester);
            map.put("REMOVE_BY_ID", removeByIdCommand);
            map.put("REMOVE_ANY_BY_STUDENTS_COUNT", removeByStudentCount);
            map.put("SAVE", saveCommand);
            map.put("SHOW", showCommand);
            map.put("UPDATE", updateCommand);

        }
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
