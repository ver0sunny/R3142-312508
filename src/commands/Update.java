package commands;

public class Update extends AbstractCommand {

    public Update(String name, String description) {
        super("update <id> {element}", "update collection element, which <id> is equal to the one provided");
    }

    @Override
    public boolean execute() {
        return true;

    }
}
