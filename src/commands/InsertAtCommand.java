package commands;

import managers.CollectionManager;

public class InsertAtCommand extends AbstractCommand {

    private CollectionManager collectionManager;
    public InsertAtCommand(CollectionManager collectionManager) {
        super("insert_at index {element}", "inserts the element to the given position");
        this.collectionManager = collectionManager;
    }

    @Override
    public boolean execute(String arg) {

        return true;
    }
}
