package commands;

import exceptions.CollectionIsEmptyException;
import managers.CollectionManager;
import managers.ConsoleManager;

public class RemoveByStudentCount extends AbstractCommand implements Command {

    private CollectionManager collectionManager;

    //FIX CLASS
    public RemoveByStudentCount(CollectionManager collectionManager) {
        super("remove_any_by_students_count <studentsCount>", "deletes element, which studentCount field equals to the one provided");
        this.collectionManager = collectionManager;
    }

    @Override
    public boolean execute(String arg) {
        try {
            if (arg.equals("")) { throw new NumberFormatException(); }
            int studentsCount = Integer.parseInt(arg);
            collectionManager.removeByStudentsCount(studentsCount);
            return true;
        } catch (NumberFormatException e) {
            ConsoleManager.printerror("No number argument entered");
        }
        return false;
    }
}
