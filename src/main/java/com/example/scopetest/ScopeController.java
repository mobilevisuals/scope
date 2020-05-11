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

    DataRequestScope dataRequestScope;
    DataSessionScope dataSessionScope;

    public DataRequestScope getDataRequestScope() {
        return dataRequestScope;
    }
    @Autowired
    public void setDataRequestScope(DataRequestScope dataRequestScope) {
        this.dataRequestScope = dataRequestScope;
    }

    public DataSessionScope getDataSessionScope() {
        return dataSessionScope;
    }
    @Autowired
    public void setDataSessionScope(DataSessionScope dataSessionScope) {
        this.dataSessionScope = dataSessionScope;
    }

    @RequestMapping("/request")
    public String requestCall() {
        return " "+dataRequestScope.getCounter();
    }


    @RequestMapping("/session")
    public String sessionCall() {
        return " "+dataSessionScope.getCounter();
    }





}
