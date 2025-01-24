package rent_car1;
//import com.sun.jdi.connect.spi.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author OZN cOxat
 */
public class emailsender {
    private Session session;
        private void init(){
        
            Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "100.00.000.000");
        props.put("mail.smtp.port", "20");
   
            
        session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("rentcaruvt@gmail.com", "Rentcr1234");
            }
        });
        }

public void sendEmail(emailclient e)throws MessagingException{
init();
Message message = new MimeMessage(session);
message.setFrom(new InternetAddress("rentcaruvt@gmail.com"));
         message.setRecipients(Message.RecipientType.TO,
             InternetAddress.parse(e.getEmailTo()));
         message.setSubject(e.getEmailSubject());
         message.setText(e.getEmailBody());
         Transport.send(message);

}
        } 

