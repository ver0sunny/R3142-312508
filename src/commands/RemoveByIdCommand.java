package commands;

import managers.CollectionManager;
import managers.ConsoleManager;

public class RemoveByIdCommand extends AbstractCommand {

    private CollectionManager collectionManager;

    public RemoveByIdCommand(CollectionManager collectionManager) {
        super("remove_by_id <id>", "deletes element with provided <id>");
        this.collectionManager = collectionManager;
    }

    @Override
    public boolean execute(String arg) {
        Integer id = Integer.parseInt(arg);
        collectionManager.removeById(id);
        ConsoleManager.println("Study Group removed successfully");
        return true;
    }
}
