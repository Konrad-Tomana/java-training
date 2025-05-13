package pl.training.module_06.repository;

import pl.training.module_06.model.Account;

public interface AccountRepository {

    Account save(Account account);

    Account[] findAll();

    Account findByNumber(String number);

}
