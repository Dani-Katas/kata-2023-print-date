package org.example;

import java.util.Date;

public class StubCalendar extends Calendar {
    private final Date date;

    public StubCalendar(Date date) {
        this.date = date;
    }

    @Override
    public Date today() {
        return date;
    }
}
