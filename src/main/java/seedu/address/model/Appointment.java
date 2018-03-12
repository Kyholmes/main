package seedu.address.model;

import java.util.Date;

import seedu.address.model.person.Person;

/**
 * Patient appointment in IMDB
 * Guarantees: details are present and not null, field values are validated, immutable.
 */
public class Appointment {

    public static final int APPOINTMENT_DURATION = 30;
    private Date appointmentDateTime;
    private Person person;
    public Appointment(Person person, Date appointmentDateTime) {
        this.person = person;
        this.appointmentDateTime = appointmentDateTime;
    }

    public Person getPerson() {
        return this.person;
    }

    public Date getAppointmentDateTime() {
        return this.appointmentDateTime;
    }
}
