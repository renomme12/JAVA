
package bankapp;

/**
 *
 * @author julia
 */
public class Savings extends Account {
     //list properties specific to saving account
    int safetyDepositBoxID;
    int safetyDepositBoxKey; 
    //constructor
    public Savings(String name, String pesel, double initDeposit){
        super( name, pesel, initDeposit);
        accountNumber = "1" + accountNumber;
      
    }
    //methods
    
    public void showInfo(){
        super.showInfo();//super pozwala nam użyć metody z klasy account równocześnie z metodą o tej samej nazwie z klasy potomnej savings
        System.out.println("Account type: Savings");
    }
}
