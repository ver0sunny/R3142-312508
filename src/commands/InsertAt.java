package commands;

public class InsertAt extends AbstractCommand {

    public InsertAt(String name, String description) {
        super("insert_at index {element}", "inserts the element to the given position");
    }

    @Override
    public void execute(String command) {

    }
}
