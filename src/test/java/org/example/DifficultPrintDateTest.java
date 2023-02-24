package org.example;

import org.junit.jupiter.api.Test;

import java.util.Date;

class DifficultPrintDateTest {

    @Test
    void printCurrentDate() {
        Date expectedDate = new Date(0);
        DifficultPrintDateTestable printDate = new DifficultPrintDateTestable();
        printDate.mockActualDateTo(expectedDate);

        printDate.printCurrentDate();

        printDate.expectToHaveBeenCalledWith(expectedDate);
    }
}