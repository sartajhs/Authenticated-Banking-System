package BAL;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

public class SendEmail {

//    public static void main(String[] args) {
//        String to = "kanchanrao24@gmail.com";//change accordingly
//        String from = "satishshahare00@gmail.com";//change accordingly
//        String host = "192.168.1.5";//or IP address
//
//        //Get the session object
//        Properties properties = System.getProperties();
//        properties.setProperty("mail.smtp.host", host);
//        Session session = Session.getDefaultInstance(properties);
//
//        //compose the message
//        try {
//            MimeMessage message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(from));
//            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//            message.setSubject("Ping");
//            message.setText("Hello, this is example of sending email  ");
//
//            // Send message
//            Transport.send(message);
//            System.out.println("message sent successfully....");
//
//        } catch (MessagingException mex) {
//            mex.printStackTrace();
//        }
//    }
}
