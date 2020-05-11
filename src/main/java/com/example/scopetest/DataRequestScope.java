package com.example.scopetest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 *
 * @author eyvind
 */
@Component
@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class DataRequestScope {
    private int counter;

    public int getCounter() {
        counter++;
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }




}
