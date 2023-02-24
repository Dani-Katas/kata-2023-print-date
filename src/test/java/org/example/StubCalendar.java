package org.example;

import java.util.Date;

public class StubCalendar extends Calendar {

    static final Date TODAY = new Date(2023, 1, 20);
    private final Date date;

    public StubCalendar(Date date) {
        this.date = date;
    }

    @Override
    public Date today() {
        return date;
    }
}
