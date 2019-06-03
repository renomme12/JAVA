
package bankapp;

/**
 *
 * @author julia
 */
public class BankApp {


    public static void main(String[] args) {
        
        Checking chkacc1 = new Checking("Tom Wilson","123456789",1500);// supr class is called first in this constructor
        
        Savings savacc1 = new Savings("Anna Kowalska","234567890",2500);
        //Read CSV File then create new accounts based on that data
        
        savacc1.showInfo();
        chkacc1.showInfo();
        
    }
    
}
