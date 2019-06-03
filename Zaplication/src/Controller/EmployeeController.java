
package Controller;


import Model.Employee;
import View.AddEmployee;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Madzia
 */
public class EmployeeController implements Serializable {
    
   Employee employee;
   public ArrayList<Employee> employees;
//   public String [] position ={"Manager", "Salesman", "Driver"};
   
   public void populateArrayList()//getting data from files- reads the file first
    {
    
        try{
            //opening file
            FileInputStream file = new FileInputStream("Employees.dat");//connetion to the file
            
            //read from the file- so input 
            ObjectInputStream inputFile = new ObjectInputStream(file);
            
            boolean endOfFile= false;
            
            while (!endOfFile){
                try{
                    employees.add((Employee) inputFile.readObject()); //we wamnt to save it as a client object dodaje do pliku ..47 min
                }
                catch(EOFException e){//endOFFile exception
                    endOfFile= true;//we cannot read file anymore?
                }
                catch(Exception f){
                    JOptionPane.showMessageDialog(null, f.getMessage());
                }
            }
            inputFile.close();//closing file
        }
        catch (IOException e){ //catching exception
            JOptionPane.showMessageDialog(null, e.getMessage());//gets error message-jesli nie ma takiego pliku
        }
    }
    
    public void saveEmployeesToFile(){
        AddEmployee clientView = new AddEmployee();        
        try{
            //opening file
            FileOutputStream file = new FileOutputStream("Employees.dat");
            
            //writing into the file so output stream
            ObjectOutputStream outputFile = new ObjectOutputStream(file);
            
            
            
            for (int i =0; i< employees.size(); i++)
            {
                outputFile.writeObject(employees.get(i));//jobs-array list - gets the object of id = i and write it to the file
            }
            
            outputFile.close();
            
            JOptionPane.showMessageDialog(null,"Successfully saved");
            clientView.dispose(); //closing the window
            
            
        }
        
        catch(IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void saveEmployeesToFileDelete(){
        AddEmployee clientView = new AddEmployee();        
        try{
            //opening file
            FileOutputStream file = new FileOutputStream("Employees.dat");
            
            //writing into the file so output stream
            ObjectOutputStream outputFile = new ObjectOutputStream(file);
            
            
            
            for (int i =0; i< employees.size(); i++)
            {
                outputFile.writeObject(employees.get(i));//jobs-array list - gets the object of id = i and write it to the file
            }
            
            outputFile.close();
            
            JOptionPane.showMessageDialog(null,"Successfully deleted");
            clientView.dispose(); //closing the window
            
            
        }
        
        catch(IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    
    
    
    
}
