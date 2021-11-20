package br.com.lab.impacta.account.application;

import br.com.lab.impacta.account.application.dto.request.DebitAccountRequest;
import br.com.lab.impacta.account.application.dto.response.AccountBalanceResponse;
import br.com.lab.impacta.account.application.dto.response.DebitAccountResponse;

public interface AccountApplication {
    AccountBalanceResponse balance(Long idAccount);

    DebitAccountResponse debit(Long idAccount, DebitAccountRequest debitAccountRequest);
}
