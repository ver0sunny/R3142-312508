package commands;

public class Execute extends AbstractCommand {


    public Execute(String name, String description) {
        super("execute_script <file_name>", "compiles script from the provided file");
    }

    @Override
    public void execute(String command) {

    }
}
