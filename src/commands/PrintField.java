package commands;

public class PrintField extends AbstractCommand {

    public PrintField(String name, String description) {
        super("print_field_descending_semester_enum", "displays field semesterEnum of all elements in descending order");
    }

    @Override
    public boolean execute() {
        return true;

    }
}
