package ObjectsFromERD;

import java.sql.Timestamp;
import java.sql.Date;

public class Appointment {
    private int appointment_id;
    private String title;
    private String description;
    private String location;
    private String type;
    private Timestamp start;
    private Timestamp End;
    private Timestamp creationDate;
    private String created_by;
    private Timestamp last_update;
    private String last_updated_by;
    private int customer_id;
    private int user_id;
    private int contact_id;

    public Appointment(int appointment_id, String title, String description, String location, String type, Timestamp start, Timestamp end, Timestamp creationDate, String created_by, Timestamp last_update, String last_updated_by, int customer_id, int user_id, int contact_id) {
        this.appointment_id = appointment_id;
        this.title = title;
        this.description = description;
        this.location = location;
        this.type = type;
        this.start = start;
        End = end;
        this.creationDate = creationDate;
        this.created_by = created_by;
        this.last_update = last_update;
        this.last_updated_by = last_updated_by;
        this.customer_id = customer_id;
        this.user_id = user_id;
        this.contact_id = contact_id;
    }
    public Appointment(String title, String description, String location, String type, Timestamp start, Timestamp end, Timestamp creationDate, String created_by, Timestamp last_update, String last_updated_by, int customer_id, int user_id, int contact_id) {
        this.title = title;
        this.description = description;
        this.location = location;
        this.type = type;
        this.start = start;
        End = end;
        this.creationDate = creationDate;
        this.created_by = created_by;
        this.last_update = last_update;
        this.last_updated_by = last_updated_by;
        this.customer_id = customer_id;
        this.user_id = user_id;
        this.contact_id = contact_id;
    }

    public int getAppointment_id() {
        return appointment_id;
    }

    public void setAppointment_id(int appointment_id) {
        this.appointment_id = appointment_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Timestamp getStart() {
        return start;
    }

    public void setStart(Timestamp start) {
        this.start = start;
    }

    public Timestamp getEnd() {
        return End;
    }

    public void setEnd(Timestamp end) {
        End = end;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public String getCreated_by() {
        return created_by;
    }

    public void setCreated_by(String created_by) {
        this.created_by = created_by;
    }

    public Timestamp getLast_update() {
        return last_update;
    }

    public void setLast_update(Timestamp last_update) {
        this.last_update = last_update;
    }

    public String getLast_updated_by() {
        return last_updated_by;
    }

    public void setLast_updated_by(String last_updated_by) {
        this.last_updated_by = last_updated_by;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getContact_id() {
        return contact_id;
    }

    public void setContact_id(int contact_id) {
        this.contact_id = contact_id;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appointment_id=" + appointment_id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", location='" + location + '\'' +
                ", type='" + type + '\'' +
                ", start=" + start +
                ", End=" + End +
                ", creationDate=" + creationDate +
                ", created_by='" + created_by + '\'' +
                ", last_update=" + last_update +
                ", last_updated_by='" + last_updated_by + '\'' +
                ", customer_id=" + customer_id +
                ", user_id=" + user_id +
                ", contact_id=" + contact_id +
                '}';
    }
}
