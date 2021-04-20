package commands;

public class Show extends AbstractCommand {

    public Show(String name, String description) {
        super("show","displays all collection elements");
    }

    @Override
    public boolean execute() {
        return true;

    }
}
