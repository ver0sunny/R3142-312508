package commands;

import collectionInfo.StudyGroup;
import exceptions.WrongScriptInputException;
import managers.CollectionManager;
import managers.ConsoleManager;
import managers.InputAndVerifier;

import java.time.LocalDateTime;
import java.util.Objects;

public class AddIfMinCommand extends AbstractCommand {

    private CollectionManager collectionManager;
    private InputAndVerifier inputAndVerifier;

    public AddIfMinCommand(CollectionManager collectionManager, InputAndVerifier inputAndVerifier) {
        super("add_if_min {element}", "adds the element to collection if its less than the least element");
        this.collectionManager = collectionManager;
        this.inputAndVerifier = inputAndVerifier;
    }


    @Override
    public boolean execute(String args) {
        try {
            StudyGroup studyGroup = new StudyGroup(collectionManager.generateId(),
                    inputAndVerifier.askName(),
                    LocalDateTime.now(),
                    inputAndVerifier.askAdminInfo(),
                    inputAndVerifier.askCoordinates(),
                    inputAndVerifier.askStudentsCount(),
                    inputAndVerifier.askShouldBeExpelled(),
                    inputAndVerifier.askFormOfEducation(),
                    inputAndVerifier.askSemester());
            collectionManager.sortCollection();
            if (studyGroup.compareTo(collectionManager.getFirst()) < 0) {
                collectionManager.addToCollection(studyGroup);
                ConsoleManager.print("Study Group added successfully");
                return true;
            } else ConsoleManager.printerror("The Study Group you are trying to add is bigger that the smallest group");
        }catch (WrongScriptInputException e) {
            ConsoleManager.printerror("Something is wrong...");
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AddIfMinCommand that = (AddIfMinCommand) o;
        return Objects.equals(collectionManager, that.collectionManager) &&
                Objects.equals(inputAndVerifier, that.inputAndVerifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), collectionManager, inputAndVerifier);
    }
}
