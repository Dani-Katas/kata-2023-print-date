package org.example;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DifficultPrintDateTest {

    @Test
    void printCurrentDate() {
        DifficultPrintDateTestable printDate = new DifficultPrintDateTestable();

        printDate.printCurrentDate();

        assertEquals(new Date(0), printDate.getArgumentCalled());
    }
}