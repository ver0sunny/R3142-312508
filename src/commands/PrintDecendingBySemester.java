package commands;

import collectionInfo.Semester;
import collectionInfo.StudyGroup;
import managers.CollectionManager;
import managers.ConsoleManager;

public class PrintDecendingBySemester extends AbstractCommand {

    CollectionManager collectionManager;

    public PrintDecendingBySemester(CollectionManager collectionManager) {
        super("print_field_descending_semester_enum", "displays field semesterEnum of all elements in descending order");
        this.collectionManager = collectionManager;
    }

    @Override
    public boolean execute(String arg) {
        ConsoleManager.println(collectionManager.decendBySemester());
        for (StudyGroup studyGroup : collectionManager.getCollection()) {
            ConsoleManager.println(studyGroup.getName() + " " + studyGroup.getSemester());
        }
        return true;

    }
}
