/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rent_car1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author OZN cOxat
 */
public class emailclient {
   private String emailTo;
    private String emailSubject;
    private String emailBody;
    private String emailAttachments;

    public emailclient() {
    }

    public emailclient(String emailTo, String emailSubject, String emailBody, String emailAttachments) {
        this.emailTo = emailTo;
        this.emailSubject = emailSubject;
        this.emailBody = emailBody;
        this.emailAttachments = emailAttachments;
    }

    public String getEmailAttachments() {
        return emailAttachments;
    }

    public String getEmailBody() {
        return emailBody;
    }

    public String getEmailSubject() {
        return emailSubject;
    }

    public String getEmailTo() {
        return emailTo;
    }

    public void setEmailAttachments(String emailAttachments) {
        this.emailAttachments = emailAttachments;
    }

    public void setEmailBody(String emailBody) {
        this.emailBody = emailBody;
    }

    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }

    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
    }

  
  
}