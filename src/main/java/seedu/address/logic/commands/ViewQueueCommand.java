package seedu.address.logic.commands;

import seedu.address.commons.core.EventsCenter;
import seedu.address.commons.events.model.QueueChangedEvent;
import seedu.address.logic.commands.exceptions.CommandException;

/**
 * Lists patient queue.
 */
public class ViewQueueCommand extends Command {

    public static final String COMMAND_WORD = "viewq";
    public static final String COMMAND_ALIAS = "vq";

    public static final String MESSAGE_SUCCESS = "Listed waiting list";

    @Override
    public CommandResult execute() throws CommandException {
        EventsCenter.getInstance().post(new QueueChangedEvent(model.getImdb()));
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
