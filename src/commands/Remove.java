package commands;

public class Remove extends AbstractCommand {

    public Remove(String name, String description) {
        super("remove_by_id <id>", "deletion of the element, which <id> is equal tho the on provided");
    }

    @Override
    public boolean execute() {
        return true;

    }
}
