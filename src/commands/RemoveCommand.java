package commands;

public class RemoveCommand extends AbstractCommand {

    public RemoveCommand(String name, String description) {
        super("remove_by_id <id>", "deletion of the element, which <id> is equal tho the on provided");
    }

    @Override
    public void execute(String command) {

    }
}
