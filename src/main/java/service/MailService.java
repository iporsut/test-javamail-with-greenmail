package service;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

/**
 * Created by roof on 11/18/15.
 */

public class MailService {
    private TransactionConfirmationEmail transactionConfirmationEmail;
    private GenericSession session;

    public MailService(GenericSession session, TransactionConfirmationEmail email) {
        this.session = session;
        this.transactionConfirmationEmail = email;
    }

    public void send(String[] recipients) throws MessagingException {
        try {
            session.sendToAll(transactionConfirmationEmail, recipients);
        }
        catch (AddressException ae) {
            ae.printStackTrace();
        }
        catch (MessagingException me) {
            me.printStackTrace();
        }
    }
}

