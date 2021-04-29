package commands;

import managers.CollectionManager;
import managers.ConsoleManager;

public class RemoveByStudentCount extends AbstractCommand implements Command {

    private CollectionManager collectionManager;

    public RemoveByStudentCount(CollectionManager collectionManager) {
        super("remove_any_by_students_count <studentsCount>", "deletes element, which studentCount field equals to the one provided");
        this.collectionManager = collectionManager;
    }

    @Override
    public boolean execute(String arg) {
        int studentsCount = Integer.parseInt(arg);
        collectionManager.removeByStudentsCount(studentsCount);
        ConsoleManager.println("Collection with " + studentsCount + "students removed successfully");
        return true;
    }
}
