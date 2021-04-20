package commands;

public class Clear extends AbstractCommand {

    public Clear(String name, String description) {
        super("clear", "empties collection");
    }

    @Override
    public boolean execute() {
        return true;

    }
}
