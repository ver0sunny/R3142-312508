package commands;

public class UpdateCommand extends AbstractCommand {

    public UpdateCommand(String name, String description) {
        super("update <id> {element}", "update collection element, which <id> is equal to the one provided");
    }

    @Override
    public void execute(String command) {

    }
}
