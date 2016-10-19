package collage;
import java.rmi.registry.*;
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.UnicastRemoteObject;
import  java.rmi.*;

 class Client 
{
    public static String giveName(String name, String surname)
    {
        Client client=new Client();
        return client.connectServer(name,surname);
        
    }

    private String connectServer(String name, String surname) 
    {
        String fullname="";
        try 
        {
            Registry reg=LocateRegistry.getRegistry(1000);
            RMIInterface rmi= (RMIInterface) reg.lookup("Server");
           fullname = rmi.makeName(name ,surname);
            return fullname;
        } catch (Exception e) 
        {
           fullname=e.getMessage();
        }
        return fullname;
    } 
}



public class ClientMachine extends javax.swing.JFrame
{
        public ClientMachine() {
        initComponents();
    }
	
 private void initComponents() {
			// TODO Auto-generated method stub
			
		}

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) 
 {                                         
        Object jLabel3;
		((Object) jLabel3).setText("Server is Responding.");
        Thread t= new Thread(new MyThread());
        t.start();
        Object jLabel4;
		jLabel4.setText("The Full Name is :    "+Client.giveName(jTextField1.getText(),jTextField2.getText()));        
  }                                        

 public static void main(String args[])
 {
        java.awt.EventQueue.invokeLater(new Runnable()
 {
            public void run() {
                new ClientMachine().setVisible(true);
            }
        });
    }
    class MyThread implements Runnable
    {
         public void run() 
         {
             for(int i=0;i<5;i++)
             {
                try 
                {
                    give();
                    Thread.sleep(1000);
                } 
                catch (Exception e)
                {
                    System.out.println(""+e);
                }
            }   
         }
         private void give()
         {
             Object jLabel3;
			jLabel3.setText(((Object) jLabel3).getText()+".");
         }
    }
}



class RMIServer extends UnicastRemoteObject implements RMIInterface {

    RMIServer() throws RemoteException
    {
        super();
    }
            
    public String makeName(String name, String surname) throws RemoteException 
    {
        String fullname =name+" "+surname;
        return fullname;
    }
    
    public static void main(String[] args)
    {
        try 
        {
            Registry reg=LocateRegistry.createRegistry(1000);
            reg.rebind("Server",new RMIServer());
            System.out.println("Server Started !!!");
        } 
        catch (Exception e) 
        {
        
        }
    }  
}



 interface RMIInterface extends Remote
{
    public String makeName(String name, String surname) throws  RemoteException;
}


