package br.com.lab.impacta.account.handler.exception;

public class AccountWithoutDebit extends RuntimeException {
    public AccountWithoutDebit() {
        super();
    }

    public AccountWithoutDebit(String messageExceptionWithoutBalance) {
        super(messageExceptionWithoutBalance);
    }
}
