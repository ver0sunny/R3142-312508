package commands;

public class AddCommand extends AbstractCommand {

    public AddCommand(String name, String description) {
        super("add {element}", "addition of a new element to the collection");
    }

    @Override
    public void execute(String command) {

    }
}
