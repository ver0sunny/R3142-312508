package commands;

public class Info extends AbstractCommand implements Command{

    public Info(String name, String description) {
        super("info", "provides information on Collection");
    }

    @Override
    public boolean execute() {
        return true;

    }
}
