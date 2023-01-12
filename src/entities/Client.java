package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private String name, email;
    private Date birthDay;

    public Client(String name, String email, Date birthDay) {
        this.name = name;
        this.email = email;
        this.birthDay = birthDay;
    }

    public Client(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String toString(){
        return name + " ("+sdf.format(birthDay)+") - "+email;
    }
}
