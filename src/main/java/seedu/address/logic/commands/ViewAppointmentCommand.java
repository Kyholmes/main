package seedu.address.logic.commands;

import seedu.address.logic.commands.exceptions.CommandException;

/**
 * List all the patient appointments.
 */
public class ViewAppointmentCommand extends Command {

    public static final String COMMAND_WORD = "viewappt";
    public static final String COMMAND_ALIAS = "va";

    public static final String MESSAGE_SUCCESS = "Listed all patient appointments";

    @Override
    public CommandResult execute() throws CommandException {
        return null;
    }
}
