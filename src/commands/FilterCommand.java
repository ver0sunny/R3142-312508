package commands;

public class FilterCommand extends AbstractCommand {

    public FilterCommand(String name, String description) {
        super("filter_greater_than_form_of_education <formOfEducation>", "displays elements with a greater value of the formOfEducation field than the one provided");
    }

    @Override
    public void execute(String command) {

    }
}
