package br.com.lab.impacta.account.application.impl;

import br.com.lab.impacta.account.application.AccountApplication;
import br.com.lab.impacta.account.application.dto.request.DebitAccountRequest;
import br.com.lab.impacta.account.application.dto.response.AccountBalanceResponse;
import br.com.lab.impacta.account.application.dto.response.DebitAccountResponse;
import org.springframework.stereotype.Component;

@Component
public class AccountApplicationImpl implements AccountApplication {

    @Override
    public AccountBalanceResponse balance(Long idAccount) {
        return null;
    }

    @Override
    public DebitAccountResponse debit(Long idAccount, DebitAccountRequest debitAccountRequest) {
        return null;
    }
}
