package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Date;

import org.junit.jupiter.api.Test;

public class PrintDateTest {
  @Test
  public void printDate() {
    Calendar calendar = spy(Calendar.class); // query (stub)
    when(calendar.today()).thenReturn(new Date(0));
    Printer printer = mock(Printer.class); // command (spy)
    PrintDate printDate = new PrintDate(calendar, printer);

    printDate.printCurrentDate();

    verify(printer).printLine("Thu Jan 01 00:00:00 WET 1970");
  }

  @Test
  public void printDate2() {
    Date expectedDate = new Date(0);
    Calendar calendar = new StubCalendar(expectedDate); // query (stub)
    SpyPrinter printer = new SpyPrinter(); // command (spy)
    PrintDate printDate = new PrintDate(calendar, printer);

    printDate.printCurrentDate();

    printer.expectToHaveBeenCalledWith("Thu Jan 01 00:00:00 WET 1970");
  }
}
