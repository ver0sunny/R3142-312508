package commands;

public class Add extends AbstractCommand {

    public Add(String name, String description) {
        super("add {element}", "addition of a new element to the collection");
    }

    @Override
    public void execute(String command) {

    }
}
