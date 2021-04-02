package commands;

public class Filter extends AbstractCommand {

    public Filter(String name, String description) {
        super("filter_greater_than_form_of_education <formOfEducation>", "displays elements with a greater value of the formOfEducation field than the one provided");
    }

    @Override
    public void execute(String command) {

    }
}
