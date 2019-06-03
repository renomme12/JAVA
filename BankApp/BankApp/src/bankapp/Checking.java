
package bankapp;

/**
 *
 * @author julia
 */
public class Checking extends Account {
    //list properties specific to checking account
    int debitCardNumber;
    int debitVardPIN;
    
      //constructor  to initialize checking account properties
    public Checking(String name, String pesel, double initDeposit){
        super( name, pesel, initDeposit);//
         accountNumber = "2" + accountNumber;
        
    }
    
     //list methods specific to checking account
    
    public void showInfo(){
        super.showInfo();
        System.out.println("Account type: Checking");
    }
    
  
    
}
