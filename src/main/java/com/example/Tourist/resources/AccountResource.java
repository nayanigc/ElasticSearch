package com.example.Tourist.resources;


import com.example.Tourist.models.Account;
import com.example.Tourist.resources.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/rest/search")
public class AccountResource {
    @Autowired
    AccountService accountService;

    @RequestMapping(value = "/account/add",method = RequestMethod.POST)
    //@PostMapping(path = "/accountbank/add")
    public Account  create (@RequestBody Account account){
        return accountService.addAccount(account);
    }

    @RequestMapping( "/")
    public String start (){
        return "Welcome ";
    }

    @RequestMapping(value = "/search" , method = RequestMethod.GET)
    public List<Account> search (){
            return accountService.searchAll();
    }

    @RequestMapping(value = "/account/{id}" , method = RequestMethod.GET)
    public Object search_account (@PathVariable("id") int idd) {
      return accountService.findOne(idd);
    }
    // Supprime
    @RequestMapping(value = "/account/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Account> deleteGreeting(@PathVariable("id") int idd) {
        accountService.delete(idd);
        return new ResponseEntity<Account>(HttpStatus.NO_CONTENT);
    }

}
