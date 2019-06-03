
package Model;

import java.io.Serializable;

/**
 *
 * @author julia
 */
public  class Person implements Serializable  {
    private String name;    
    private String surname;
    private String pesel;
    private String phoneNumber;
    private String email;

    public Person(String name, String surname, String pesel, String phoneNumber, String email) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPesel() {
        return pesel;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
