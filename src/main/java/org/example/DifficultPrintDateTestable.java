package org.example;

import java.util.Date;

public class DifficultPrintDateTestable extends DifficultPrintDate {

    private Date argumentCalled;

    @Override
    protected void print(Date date) {
        argumentCalled = date;
    }

    @Override
    protected Date getDate() {
        return new Date(0);
    }

    public Date getArgumentCalled() {
        return argumentCalled;
    }
}
