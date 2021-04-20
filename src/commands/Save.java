package commands;

public class Save extends AbstractCommand {


    public Save(String name, String description) {
        super("save", "saves collection to a file");
    }

    @Override
    public boolean execute() {
        return true;

    }
}
