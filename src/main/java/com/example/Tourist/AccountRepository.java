package com.example.Tourist;


import com.example.Tourist.models.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account, Integer> {
   /* List<Account> findAccounts (@Param("id") long account_number);
    List<Account> findAll ();*/

}
