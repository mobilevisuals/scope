package com.example.scopetest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {

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



}
