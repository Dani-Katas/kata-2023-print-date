package org.example;

import org.junit.jupiter.api.Test;

public class PrintDateTest {
  @Test
  public void printDate() throws Exception {
    PrintDate printDate = new PrintDate(new Calendar(), new Printer());

    printDate.printCurrentDate();

    // How can we test this function?
  }
}
