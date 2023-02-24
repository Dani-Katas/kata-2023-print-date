package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpyPrinter extends Printer {

    private String argument;

  @Override
    public void printLine(String line) {
        argument = line;
    }

    public String argument() {
        return argument;
    }

  void expectToHaveBeenCalledWith(String expected) {
    assertEquals(expected, argument());
  }
}
