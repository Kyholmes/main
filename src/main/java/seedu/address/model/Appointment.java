package seedu.address.model;

import java.util.Date;


/**
 * Patient appointment in IMDB
 * Guarantees: details are present and not null, field values are validated, immutable.
 */
public class Appointment {

    public static final int APPOINTMENT_DURATION = 30;
    private Date appointmentDateTime;
    private String patientName;
    public Appointment(String patientName, Date appointmentDateTime) {
        this.patientName = patientName;
        this.appointmentDateTime = appointmentDateTime;
    }

    public String getPatientName() {
        return this.patientName;
    }

    public Date getAppointmentDateTime() {
        return this.appointmentDateTime;
    }
}
