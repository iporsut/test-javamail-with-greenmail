package service;

/**
 * Created by roofimon on 11/19/2015 AD.
 */
public class FakeMailSession extends GenericMailSession {
    public FakeMailSession() {
        super();
        super.smtpAccount = new SMTPAccount("fake@email.com", "password", "localhost", 3025);
    }
}
