package commands;

public class AddIfCommand extends AbstractCommand {

    public AddIfCommand(String name, String description) {
        super("add_if_min {element}", "adds the element to colection if its less than the least element");
    }

    @Override
    public void execute(String command) {

    }
}
