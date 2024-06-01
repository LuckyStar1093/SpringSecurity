package com.codeyourself.springsecuritybasic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {

    @GetMapping("/loanDetails")
    public String getLoansDetails(){
        return "Loans Details from DB";
    }
}
