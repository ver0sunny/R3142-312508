package commands;

public class InsertCommand extends AbstractCommand {

    public InsertCommand(String name, String description) {
        super("insert_at index {element}", "inserts the element to the given position");
    }

    @Override
    public void execute(String command) {

    }
}
