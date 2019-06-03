
package Model;

import java.io.Serializable;

/**
 *
 * @author julia
 */
public class Employee extends Person implements Serializable{
    
    private static final long serialVersionUID = -2164407965660220160L;

    //public String [] position ={"Manager", "Salesman", "Driver"};
 private String job;
    private String staffNr;
    
    public Employee(String name, String surname, String pesel, String phoneNumber, String email, String job, String staffNr) {
        super( name,  surname,  pesel, phoneNumber,  email);
        this.job = job;
        this.staffNr = staffNr;
    }

    public String getJob() {
        return job;
    }

    public String getStaffNr() {
        return staffNr;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setStaffNr(String staffNr) {
        this.staffNr = staffNr;
    }
    
    
}
