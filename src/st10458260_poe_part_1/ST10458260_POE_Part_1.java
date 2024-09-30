/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package st10458260_poe_part_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Ndumiso
 */
public class ST10458260_POE_Part_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        register();
        
        login();
}
    
public static void register() {
     String username = "";
     String password = "";
        
     boolean validusername = false;
     boolean validpassword = false;
     boolean RegisterSuccess = false;
     
      String FirstName = JOptionPane.showInputDialog("Please enter your first Name");
      String LastName = JOptionPane.showInputDialog("please enter your last Name");
     
      while (!validusername){
        username = JOptionPane.showInputDialog("Please enter your username");
        if(username.contains("_") && username.length() <= 5){
         JOptionPane.showMessageDialog(null,"Username captured successfully");
         validusername = true;
        }else{
        JOptionPane.showMessageDialog(null,"username is invalid, please ensure that your usernme contains"
                + "an underscore(_) and is less than 5 characters");
        }
        while(!validpassword){
        password = JOptionPane.showInputDialog("please enter your password");
         if(password != null && password.length()>= 8
           && password.matches(".*[A-Z]*.") && 
              password.matches(".*[0-9]*.") &&
              password.matches(".*[!@#$%^&*]*.")){
         JOptionPane.showMessageDialog(null,"password successfully captured");
         validpassword = true;
        }else{
        JOptionPane.showMessageDialog(null,"Password is not correctly formatted, please ensure that the password contains atleast 8 characters"
        + ", a capital letter, a number and a special character");
        }
          if (!RegisterSuccess) {
            JOptionPane.showMessageDialog(null, "Registered successfully!");
            RegisterSuccess = true;
        } else {
            JOptionPane.showMessageDialog(null, "Unsuccessfully registered! Invalid username or password.");
        }
    }
      
        JOptionPane.showMessageDialog( null,
                "First Name :" + FirstName + 
                "\n" + "Last Name : " + LastName +
                "\n" + "Username : " + username +
                "\n" + "password : " + password);
        
       
        }
     }
   public static void login()  {
        String username = "";
        String password = "";
        
        boolean validusername = false;
        boolean validpassword = false;
        boolean loginSuccess = false;
        
        while (!validusername){
        username = JOptionPane.showInputDialog("Please enter your username");
        if(username.contains("_") && username.length() <= 5){
         JOptionPane.showMessageDialog(null,"Username captured successfully");
         validusername = true;
        }else{
        JOptionPane.showMessageDialog(null,"username is invalid, please ensure that your usernme contains"
                + "an underscore(_) and is less than 5 characters");
        }
        while(!validpassword){
        password = JOptionPane.showInputDialog("please enter your password");
         if(password != null && password.length()>= 8
           && password.matches(".*[A-Z]*.") && 
              password.matches(".*[0-9]*.") &&
              password.matches(".*[!@#$%^&*]*.")){
         JOptionPane.showMessageDialog(null,"password successfully captured");
         validpassword = true;
        }else{
        JOptionPane.showMessageDialog(null,"Password is not correctly formatted, please ensure that the password contains atleast 8 characters"
        + ", a capital letter, a number and a special character");
        }
          if (!loginSuccess) {
            JOptionPane.showMessageDialog(null, "Login successful!");
            loginSuccess = true;
        } else {
            JOptionPane.showMessageDialog(null, "Login failed! Invalid username or password.");
        }
    }
    
}
    }
}
