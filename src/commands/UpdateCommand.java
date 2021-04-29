package commands;

import collectionInfo.*;
import exceptions.NoElementWithSuchIdException;
import managers.CollectionManager;
import managers.ConsoleManager;
import managers.Input;
import managers.InputAndVerifier;

import java.time.LocalDateTime;

public class UpdateCommand extends AbstractCommand {

    private CollectionManager collectionManager;
    private InputAndVerifier inputAndVerifier;

    public UpdateCommand(CollectionManager collectionManager, InputAndVerifier inputAndVerifier) {
        super("update <id> {element}", "update collection element, which <id> is equal to the one provided");
        this.collectionManager = collectionManager;
        this.inputAndVerifier = inputAndVerifier;
    }

    @Override
    public boolean execute(String arg) {
        try {
            Integer id = Integer.parseInt(arg);
            StudyGroup oldStudyGroup = collectionManager.getById(id);
            if (oldStudyGroup == null) throw new NoElementWithSuchIdException();

            String name = oldStudyGroup.getName();
            Coordinates coordinates = oldStudyGroup.getCoordinates();
            int studentsCount = oldStudyGroup.getStudentsCount();
            int shouldBeExpelled = oldStudyGroup.getShouldBeExpelled();
            FormOfEducation formOfEducation = oldStudyGroup.getFormOfEducation();
            Semester semester = oldStudyGroup.getSemester();
            Person groupAdmin = oldStudyGroup.getGroupAdmin();

            name = inputAndVerifier.askName();
            coordinates = inputAndVerifier.askCoordinates();
            studentsCount = inputAndVerifier.askStudentsCount();
            shouldBeExpelled = inputAndVerifier.askShouldBeExpelled();
            formOfEducation = inputAndVerifier.askFormOfEducation();
            semester = inputAndVerifier.askSemester();
            groupAdmin = inputAndVerifier.askAdminInfo();

            ConsoleManager.println("Study Group updated successfully");
            return true;
        }catch (NoElementWithSuchIdException e) {
            ConsoleManager.printerror("There is no collection with id = " + arg);
        }
        return false;
    }
}
