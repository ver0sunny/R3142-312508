package commands;

public class AddIfMin extends AbstractCommand {

    public AddIfMin(String name, String description) {
        super("add_if_min {element}", "adds the element to colection if its less than the least element");
    }

    @Override
    public boolean execute() {
return true;
    }
}
