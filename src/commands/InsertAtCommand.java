package commands;

import collectionInfo.*;
import managers.CollectionManager;
import managers.ConsoleManager;
import managers.InputAndVerifier;

import java.time.LocalDateTime;

public class InsertAtCommand extends AbstractCommand {

    private CollectionManager collectionManager;
    private InputAndVerifier inputAndVerifier;
    public InsertAtCommand(CollectionManager collectionManager, InputAndVerifier inputAndVerifier) {
        super("insert_at <id>", "inserts the element to the provided position");
        this.collectionManager = collectionManager;
        this.inputAndVerifier = inputAndVerifier;
    }

    @Override
    public boolean execute(String arg) {
        Integer idParsed = Integer.parseInt(arg);
        ConsoleManager.println("Now you will be prompted to creating a new Study Group");
//        for (StudyGroup studyGroup : collectionManager.getCollection()) {
//            if (studyGroup.getId() == idParsed) {
//                collectionManager.getCollection().
//            }
//        }
        ConsoleManager.println("Study Group successfully inserted");
        return true;
    }
}
