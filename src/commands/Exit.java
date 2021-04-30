package commands;

public class Exit extends AbstractCommand {

    public Exit() {
        super("exit", "completes program, without no data saved to file");
    }

    @Override
    public boolean execute(String arg) {

        return true;
    }
}
