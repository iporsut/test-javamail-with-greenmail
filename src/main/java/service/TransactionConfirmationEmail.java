package service;

public class TransactionConfirmationEmail extends EmailTemplate {

    public TransactionConfirmationEmail() {
        subject = "Notice of transaction";
        body = "Your transaction is completed !!!";
    }
}