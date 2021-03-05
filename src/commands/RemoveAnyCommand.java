package commands;

public class RemoveAnyCommand extends AbstractCommand {

    public RemoveAnyCommand(String name, String description) {
        super("remove_any_by_students_count <studentsCount>", "deletes element, which studentCount field equals to the one provided");
    }

    @Override
    public void execute(String command) {

    }
}
