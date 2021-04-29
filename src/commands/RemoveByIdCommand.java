package commands;

import collectionInfo.StudyGroup;
import managers.CollectionManager;
import managers.ConsoleManager;
import managers.Input;

public class RemoveByIdCommand extends AbstractCommand {

    private CollectionManager collectionManager;

    public RemoveByIdCommand(CollectionManager collectionManager) {
        super("remove_by_id <id>", "deletion of the element, which <id> is equal tho the on provided");
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
