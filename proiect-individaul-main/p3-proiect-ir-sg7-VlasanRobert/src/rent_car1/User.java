/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rent_car1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author OZN cOxat
 */
public class User {
    String Username;
    String Password;
    
    Boolean Isadmin;

    public User(){}
    public User(String Username, String Password, Boolean Isadmin) {
        this.Username = Username;
        this.Password = Password;
        this.Isadmin = Isadmin;
    }

  //  User() {
   //     throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  //  }

    public Boolean getIsadmin() {
        return Isadmin;
    }

    public String getPassword() {
        return Password;
    }

    public String getUsername() {
        return Username;
    }

    public void setIsadmin(Boolean Isadmin) {
        this.Isadmin = Isadmin;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }
    
     public static void mamConectat(User utilizator){
      try {
          try (FileWriter writer = new FileWriter("dateConectare.txt")) {
              writer.write(utilizator.getUsername()+"\n");
              writer.write(utilizator.getPassword()+"\n");
              
              writer.close();
          }
        } catch (IOException e) {
        }
      System.out.println("Scris in fisier cu succes");
      
        
    }
     
     
     public static String verificConectarea(){
     String verf=new String();
        try {
        BufferedReader reader = new BufferedReader(new FileReader("dateConectare.txt"));
            String line;
            
            
            line = reader.readLine();
            // System.out.println(line);
            verf=line;
        reader.close();
        } catch (IOException e) {
        }
      
        if(verf.equals("null"))
        {
            System.out.println("nu merge");
    }
        
        return verf;
        

}
     
}
