package commands;

import collectionInfo.StudyGroup;
import exceptions.WrongScriptInputException;
import managers.CollectionManager;
import managers.CommandManager;
import managers.ConsoleManager;
import managers.InputAndVerifier;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class AddCommand extends AbstractCommand implements Command{
    private CollectionManager collectionManager;
    private InputAndVerifier inputAndVerifier;

    public AddCommand() {
        super("add {element}", "addition of a new element to the collection");
    }

    @Override
    public boolean execute() {
        try {
            collectionManager.addToCollection(new StudyGroup(
                    collectionManager.generateId(),
                    inputAndVerifier.askName(),
                    LocalDateTime.now(),
                    inputAndVerifier.askAdminInfo(),
                    inputAndVerifier.askCoordinates(),
                    inputAndVerifier.askStudentsCount(),
                    inputAndVerifier.askShouldBeExpelled(),
                    inputAndVerifier.askFormOfEducation(),
                    inputAndVerifier.askSemester() ) );
            ConsoleManager.print("Study Group added successfully");
            return true;
        }catch (WrongScriptInputException e ) {
            ConsoleManager.printerror("something went wrong");
        }
        return false;
    }
}
