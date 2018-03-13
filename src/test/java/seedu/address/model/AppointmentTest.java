package seedu.address.model;

import org.junit.Test;

import seedu.address.model.appointment.Appointment;
import seedu.address.testutil.Assert;

public class AppointmentTest {

    @Test
    public void constructor_null_throwsNullPointerException() {
        Assert.assertThrows(NullPointerException.class, () -> new Appointment(null, null));
    }
}
