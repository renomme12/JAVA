
package bankapp;

/**
 *
 * @author julia
 */
public abstract class Account implements IRate{
    //List common properties for savings and checking account
    String name;
    String sSN;//pesel
    double balance;
    
    static int index = 10000;
    String accountNumber;
    double rate;
   
    // constructor to set base properties and initialize the account
    //nawet jesli nie bedziemy tworzyć obiektów w klasie abstrakcyjnej 
    //możemy to nazwać konstruktorem
    public Account(String name, String sSN, double initDeposit){
        this.name = name;
        this.sSN =sSN;
        balance = initDeposit;
       
        // Set account number
        index++;
        this.accountNumber = setAccountNumber();
        
    }
    
    // Set account number
    //last two digits os ssn/jakby dwie ostatnie cyfry peselu
    private String setAccountNumber(){
        String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());//dzieki metodzie substring
        //mozemy uzyskac dwa ostatnie znaki z naszego stringa którym jest sSN
        
        int uniqueID = index;
        
        int randomNumber = (int) (Math.random() * 1000);//math random daje przypadkową liczbę miedzy 0 a 1
        return lastTwoOfSSN + uniqueID + randomNumber;
    }
    
 
    //List common methods
            
    //pokaż informacje o koncie
    public void  showInfo(){
        System.out.println(
        "Name: " + name + "\nAccount number:  " + accountNumber 
                + "\nBalance:  " + balance );
        
        
        
    }
    
    
    
    
}
