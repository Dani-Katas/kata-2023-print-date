package org.example;

import java.util.Date;

public class DifficultPrintDate {
    public void printCurrentDate() {
        print(getDate());
    }

    protected void print(Date date) {
        System.out.println(date);
    }

    protected Date getDate() {
        return new Date();
    }
}
