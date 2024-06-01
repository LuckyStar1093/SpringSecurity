package com.codeyourself.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {
    @GetMapping("/myAccounts")
    public String getAccountDetails(){
        return "Account detaisl from DB";
    }
}
