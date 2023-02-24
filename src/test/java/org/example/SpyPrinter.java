package org.example;

public class SpyPrinter extends Printer {

    private String argument;

    @Override
    public void printLine(String line) {
        argument = line;
    }

    public String argument() {
        return argument;
    }
}
