package com.example.scopetest;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 *
 * @author eyvind
 */
@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class DataSessionScope {

    private int counter;

    public int getCounter() {
        counter++;
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
