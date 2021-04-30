package commands;

import collectionInfo.*;
import exceptions.NoElementWithSuchIdException;
import managers.CollectionManager;
import managers.ConsoleManager;
import managers.InputAndVerifier;

import java.time.LocalDateTime;

public class UpdateCommand extends AbstractCommand {

    private CollectionManager collectionManager;
    private InputAndVerifier inputAndVerifier;

    public UpdateCommand(CollectionManager collectionManager, InputAndVerifier inputAndVerifier) {
        super("update <id>", "updates collection element, which <id> is equal to the one provided");
        this.collectionManager = collectionManager;
        this.inputAndVerifier = inputAndVerifier;
    }

    @Override
    public boolean execute(String arg) {
        try {
            Integer idParsed = Integer.parseInt(arg);
            StudyGroup oldStudyGroup = collectionManager.getById(idParsed);
            if (oldStudyGroup == null) throw new NoElementWithSuchIdException();

            collectionManager.getById(idParsed).setName(inputAndVerifier.askName());
            collectionManager.getById(idParsed).setCreationDate(LocalDateTime.now());
            collectionManager.getById(idParsed).setGroupAdmin(inputAndVerifier.askAdminInfo());
            collectionManager.getById(idParsed).setCoordinates(inputAndVerifier.askCoordinates());
            collectionManager.getById(idParsed).setStudentsCount(inputAndVerifier.askStudentsCount());
            collectionManager.getById(idParsed).setShouldBeExpelled(inputAndVerifier.askShouldBeExpelled());
            collectionManager.getById(idParsed).setFormOfEducation(inputAndVerifier.askFormOfEducation());
            collectionManager.getById(idParsed).setSemester(inputAndVerifier.askSemester());

            ConsoleManager.println("Study Group updated successfully");
            return true;
        }catch (NoElementWithSuchIdException e) {
            ConsoleManager.printerror("There is no collection with id = " + arg);
        }
        return false;
    }
}
