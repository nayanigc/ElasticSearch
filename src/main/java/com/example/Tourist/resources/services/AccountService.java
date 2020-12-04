package com.example.Tourist.resources.services;

import com.example.Tourist.AccountRepository;
import com.example.Tourist.models.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    private List<Account> accounts;
    public Account addAccount(Account newAccount){
        return accountRepository.save(newAccount);
    }

/**
 * Créer une fonction cherche une id
 *
 *
 * @return*/
    public Optional<Account> findOne (int id){
       return accountRepository.findById(id);
    }

    public List<Account> searchAll (){
        List<Account> accountsList = new ArrayList<>();
        Iterable<Account> accountses = accountRepository.findAll();
        accountses.forEach(accountsList::add);
        return accountsList;
    }

    public void delete(int id) {
         accountRepository.deleteById(id);

    }

}
