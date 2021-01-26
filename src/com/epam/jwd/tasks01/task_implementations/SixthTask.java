package com.epam.jwd.tasks01.task_implementations;

import com.epam.jwd.tasks01.Task;

import java.text.MessageFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class SixthTask implements Task {
    private Long seconds;
    private Calendar result;

    public Task init(long seconds) throws IllegalArgumentException {
        if(seconds < 0 || seconds > 86400) {
            throw new IllegalArgumentException("Passed argument is invalid: " + seconds);
        }
        this.seconds = seconds;
        return this;
    }

    @Override
    public void solve() {
        result = new GregorianCalendar();
        result.setTimeInMillis(seconds * 1000);
    }

    @Override
    public Object result() {
        return result;
    }

    @Override
    public String answer() {
        return MessageFormat.format("Hours: {0} Minutes: {1} Seconds: {2}",
                result.get(Calendar.HOUR),
                result.get(Calendar.MINUTE),
                result.get(Calendar.SECOND));
    }
}
