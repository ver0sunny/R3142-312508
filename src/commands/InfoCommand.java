package commands;

import managers.CollectionManager;
import managers.ConsoleManager;

import java.time.LocalDateTime;

public class InfoCommand extends AbstractCommand implements Command{

    private CollectionManager collectionManager;

    public InfoCommand(CollectionManager collectionManager) {
        super("info", "provides information on Collection");
        this.collectionManager = collectionManager;
    }

    @Override
    public boolean execute(String arg) {
        LocalDateTime creationTime = collectionManager.getCreationTime();
        ConsoleManager.println("--Collection information--");
        ConsoleManager.println("Collection type -- " + collectionManager.getCollection().getClass().getName());
        ConsoleManager.println("Collection size -- " + collectionManager.getCollectionSize());
        ConsoleManager.println("Collection creation date -- " + collectionManager.getCreationTime());
        return true;
    }
}
