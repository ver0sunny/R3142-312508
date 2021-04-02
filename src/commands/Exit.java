package commands;

public class Exit extends AbstractCommand {

    public Exit(String name, String description) {
        super("exit", "completes program, without no data saved to file");
    }

    @Override
    public void execute(String command) {

    }
}
