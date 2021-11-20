package br.com.lab.impacta.account.service;

import br.com.lab.impacta.account.model.Account;

public interface AccountService {
    Account findAccount(Long id);

    void debitAccount(Long id, Double valueOfDebit);
}
