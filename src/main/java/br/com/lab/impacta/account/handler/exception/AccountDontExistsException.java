package br.com.lab.impacta.account.handler.exception;

public class AccountDontExistsException extends RuntimeException {
    public AccountDontExistsException() {
        super();
    }

    public AccountDontExistsException(String messageExceptionAccountDontExists) {
        super(messageExceptionAccountDontExists);
    }
}
