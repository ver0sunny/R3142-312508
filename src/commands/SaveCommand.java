package commands;

import managers.CollectionManager;
import managers.ConsoleManager;

public class SaveCommand extends AbstractCommand {

    private CollectionManager collectionManager;

    public SaveCommand(CollectionManager collectionManager) {
        super("save", "saves collection to a file");
        this.collectionManager = collectionManager;
    }

    @Override
    public boolean execute(String arg) {
        collectionManager.saveCollection();
        ConsoleManager.println("Collection saved successfully");
        return true;

    }
}
