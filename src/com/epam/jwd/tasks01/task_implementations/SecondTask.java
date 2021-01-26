package com.epam.jwd.tasks01.task_implementations;

import com.epam.jwd.tasks01.Task;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class SecondTask implements Task {
    private Integer year;
    private Integer month;
    private Integer result;

    public Task init(int month, int year) throws IllegalArgumentException {
        if(month < 0 || month > 12 || year < 0){
            throw new IllegalArgumentException("Passed arguments are invalid: [" + month + ", " + year + "]");
        }
        this.month = month;
        this.year = year;
        return this;
    }

    @Override
    public void solve() {
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        result = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
    }

    @Override
    public Integer result(){
        return result;
    }

    @Override
    public String answer(){
        return "There are " + result + " days in " + month + " month of " + year + " year.";
    }
}
