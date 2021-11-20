package br.com.lab.impacta.account.handler;

import br.com.lab.impacta.account.handler.exception.AccountDontExistsException;
import br.com.lab.impacta.account.handler.exception.ErrorMessageResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class ControllerExceptionHandler {

    @Value("${lab.account.exceptions.account-dont-exists-description}")
    String messageExceptionAccountDontExistsDescription;

    @ExceptionHandler(AccountDontExistsException.class)
    public ResponseEntity<ErrorMessageResponse> accountNotFoundException(
            AccountDontExistsException accessControlException, WebRequest webRequest) {

        ErrorMessageResponse errorMessageResponse = new ErrorMessageResponse(
                HttpStatus.NOT_FOUND.value(),
                new Date(),
                accessControlException.getMessage(),
                messageExceptionAccountDontExistsDescription
        );

        return new ResponseEntity<>(errorMessageResponse, HttpStatus.NOT_FOUND);
    }


}
