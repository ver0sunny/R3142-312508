package commands;

public class Help extends AbstractCommand {

    public Help(String name, String description) {
        super("help", "info on available commands");
    }

    @Override
    public boolean execute() {
        return true;

    }
}
