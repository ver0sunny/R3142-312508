package commands;

import collectionInfo.Semester;
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
        Semester semester = Semester.valueOf(arg.toUpperCase());
        ConsoleManager.println(collectionManager.decendBySemester());
        return true;

    }
}
