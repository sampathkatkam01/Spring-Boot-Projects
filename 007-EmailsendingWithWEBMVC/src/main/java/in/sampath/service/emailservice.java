package in.sampath.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import in.sampath.entity.User;
import jakarta.mail.Message;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

@Service
public class emailservice {

  @Autowired
  private JavaMailSender emailSender;

  public void sendRegistrationEmail(User user) {
    MimeMessage message = emailSender.createMimeMessage();
    try {
      message.setSubject("Account Created - Ashok IT");
      message.setContent("Congratulations.. you are onboard..", "text/html");
      message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(user.getEmail()));
      emailSender.send(message);
    } catch (Exception e) {
      // Handle email sending error
    }
  }
}
