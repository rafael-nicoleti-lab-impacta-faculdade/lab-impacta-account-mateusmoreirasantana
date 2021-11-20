package br.com.lab.impacta.account.service.impl;

import br.com.lab.impacta.account.handler.exception.AccountDontExistsException;
import br.com.lab.impacta.account.handler.exception.AccountWithoutDebit;
import br.com.lab.impacta.account.model.Account;
import br.com.lab.impacta.account.repository.AccountRepository;
import br.com.lab.impacta.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Value("${lab.account.exceptions.account-dont-exists-message}")
    String messageExceptionAccountDontExists;

    @Value("${lab.account.exceptions.account-without-balance-message}")
    String messageExceptionWithoutBalance;

    @Override
    public Account findAccount(Long id) {
        Optional<Account> account = accountRepository.findById(id);
        if (!account.isPresent()) throw new AccountDontExistsException(messageExceptionAccountDontExists);
        return account.get();
    }

    @Override
    public void debitAccount(Long id, Double valueOfDebit) {
        Account account = this.findAccount(id);
        boolean debited = account.debit(valueOfDebit);
        if (!debited) throw new AccountWithoutDebit(messageExceptionWithoutBalance);
        accountRepository.save(account);
    }
}
