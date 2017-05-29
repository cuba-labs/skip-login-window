package com.company.sample.web;

import com.haulmont.cuba.web.DefaultApp;

public class App extends DefaultApp {

    @Override
    protected String routeTopLevelWindowId() {
        return "mainWindow";
    }
}
