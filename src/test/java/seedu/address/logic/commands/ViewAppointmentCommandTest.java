package seedu.address.logic.commands;

import org.junit.Before;

import seedu.address.model.Model;

public class ViewAppointmentCommandTest {

    private Model model;
    private Model expectedModel;
    private ViewAppointmentCommand viewAppointmentCommand;

    @Before
    public void setUp() {

        viewAppointmentCommand = new ViewAppointmentCommand();
    }
}
