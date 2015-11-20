package service;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

/**
 * Created by roof on 11/18/15.
 */

public class MailService {
    private EmailTemplate emailTemplate;
    private GenericSession session;

    public MailService(GenericSession session, EmailTemplate emailTemplate) {
        this.session = session;
        this.emailTemplate = emailTemplate;
    }

    public void send(String[] recipients) throws MessagingException {
        try {
            session.sendToAll(emailTemplate, recipients);
        }
        catch (AddressException ae) {
            ae.printStackTrace();
        }
        catch (MessagingException me) {
            me.printStackTrace();
        }
    }
}

