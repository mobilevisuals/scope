package com.example.scopetest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author eyvind
 */
@RestController
public class ScopeController {

    private Customer customer;

    public Customer getCustomer() {
        return customer;
    }
    @Autowired
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @RequestMapping("/request")
    public String requestCall() {
        return " "+customer.getDataRequestScope().getCounter();
    }


    @RequestMapping("/session")
    public String sessionCall() {
        return " "+customer.getDataSessionScope().getCounter();
    }





}
