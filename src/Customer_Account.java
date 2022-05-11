import java.util.Date;
import java.time.format.DateTimeFormatter;

public class Customer_Account {
    //private int count = 0;
    private String date = "";
    private String email = "";
    private String eventType = "";
    public Customer_Account(String initDate, String initEmail, String initEventType){
        this.date = initDate;
        this.email = initEmail;
        this.eventType = initEventType;
    }
    public String getDate() {
        return date;
    }
    public void setDate() {
        this.date = date;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail() {
        this.email = email;
    }
    public String getEventType() {
        return eventType;
    }
    public void setEventType() {
        this.eventType = eventType;
    }
    public String toString() {
        return date + "," + email + "," + eventType;
    }

}
