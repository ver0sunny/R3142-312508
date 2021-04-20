package commands;

public class RemoveByStudentCount extends AbstractCommand implements Command{

    public RemoveByStudentCount(String name, String description) {
        super("remove_any_by_students_count <studentsCount>", "deletes element, which studentCount field equals to the one provided");
    }

    @Override
    public boolean execute() {
return true;
    }
}
