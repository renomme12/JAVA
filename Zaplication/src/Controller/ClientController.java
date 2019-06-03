
package Controller;

import Model.Client;
import View.AddClient;
import View.EditClient;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;


public class ClientController implements Serializable{
   // Client client;
    
    public ArrayList<Client> clients;//arraylist from client objects - client is a type of array?
    //clients = new ArrayList<Client>();

            
    public void populateArrayList()//getting data from files- reads the file first
    {
    
        try{
            //opening file
            FileInputStream file = new FileInputStream("Clients.dat");//connetion to the file
            
            //read from the file- so input 
            ObjectInputStream inputFile = new ObjectInputStream(file);
            
            boolean endOfFile= false;
            
            while (!endOfFile){
                try{
                    clients.add((Client) inputFile.readObject()); //we want to save it as a client object dodaje do pliku ..47 min
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
    
    public void saveClientsToFile(){
        AddClient clientView = new AddClient();        
        try{
            //opening file
            FileOutputStream file = new FileOutputStream("Clients.dat");
            
            //writing into the file so output stream
            ObjectOutputStream outputFile = new ObjectOutputStream(file);
            
            
            
            for (int i =0; i< clients.size(); i++)
            {
                outputFile.writeObject(clients.get(i));//jobs-array list - gets the object of id = i and write it to the file
            }
            
            outputFile.close();
            
            JOptionPane.showMessageDialog(null,"Successfully saved");
            clientView.dispose(); //closing the window
            
            
        }
        
        catch(IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    
     public void saveClientsToFileDelete(){
        EditClient clientView = new EditClient();        
        try{
            //opening file
            FileOutputStream file = new FileOutputStream("Clients.dat");
            
            //writing into the file so output stream
            ObjectOutputStream outputFile = new ObjectOutputStream(file);
            
            
            
            for (int i =0; i< clients.size(); i++)
            {
                outputFile.writeObject(clients.get(i));//jobs-array list - gets the object of id = i and write it to the file
            }
            
            outputFile.close();
            
            JOptionPane.showMessageDialog(null,"Successfully deleted!");
            clientView.dispose(); //closing the window
            
            
        }
        
        catch(IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    
    
    
    
    
    
    
    
    
    
//   public ClientController()
//   {
//       client = new Client();
//   }
//   public void writeName(String name)
//   {
//       client.setName(name);
//   }
//   public void writeSurname(String surname)
//   {
//       client.setSurname(surname);
//   }
//   public void writePesel(String pesel)
//   {
//       client.setPesel(pesel);
//   }
//   public void writeEmail(String email)
//   {
//       client.setEmail(email);
//   }
//   
//   public void writePhoneNumber(String phoneNumber)
//   {
//       client.setPhoneNumber(phoneNumber);
//   }
//   
//   public String readName()
//   {
//      return  client.getName();
//   }
//    public String readSurname()
//   {
//       return client.getSurname();
//   }
//    public String readPesel()
//   {
//        return client.getPesel();
//   }
//    public String readEmail()
//   {
//      return client.getEmail();
//   }
//    public String readPhoneNumber()
//   {
//      return client.getPhoneNumber();
//   }

    
    
}
