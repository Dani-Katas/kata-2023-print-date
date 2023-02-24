package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

public class DifficultPrintDateTestable extends DifficultPrintDate {

    private Date date;

    private Date argumentCalled;

    @Override
    protected void print(Date date) {
        argumentCalled = date;
    }

    @Override
    protected Date getDate() {
        return date;
    }

    public void mockActualDateTo(Date date) {
        this.date = date;
    }

    public Date getArgumentCalled() {
        return argumentCalled;
    }

    void expectToHaveBeenCalledWith(Date expectedDate) {
        assertEquals(expectedDate, getArgumentCalled());
    }
}
