
package Model;

import java.io.Serializable;

/**
 *
 * @author julia
 */
public class Client extends Person  implements Serializable  {

    private static final long serialVersionUID = -1794740674687484067L;//

    public Client(String name, String surname, String pesel, String phoneNumber, String email) {
    super( name,  surname,  pesel, phoneNumber,  email);
    }

    
}
